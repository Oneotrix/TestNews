package com.oneotrix.testnews.data

import com.oneotrix.testnews.data.remote.RemoteDataSource
import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.models.DetailNews
import com.oneotrix.testnews.domain.models.ShortNews
import com.oneotrix.testnews.domain.repository.NewsRepository

class NewsRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
): NewsRepository {
    override suspend fun getCategories(): List<Category> {
        return remoteDataSource.getCategories().list
            .map { MapperData.mapCategoriesResponse(it) }
    }

    override suspend fun getCountPagesByCategory(categoryId: Long): Int {
        var page = 0

        while (true) {
            when(remoteDataSource.isPageEmpty(categoryId, page)) {
                true -> break
                false -> page++
            }
        }

        return page
    }

    override suspend fun getNewsPageByCategory(categoryId: Long, page: Int): List<ShortNews> {
        return remoteDataSource.getNewsPage(categoryId, page).list
            .map { MapperData.mapNewsResponse(it) }
    }

    override suspend fun getNewsDetail(id: Long): DetailNews {
        val response = remoteDataSource.getDetailNews(id)

        return MapperData.mapDetailNewsResponse(response.news)
    }

    override fun getCurrentPage(): Int {
        TODO("Not yet implemented")
    }

    override fun getCurrentCategoryId(): Long {
        TODO("Not yet implemented")
    }
}