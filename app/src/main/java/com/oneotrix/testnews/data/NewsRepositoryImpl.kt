package com.oneotrix.testnews.data

import com.oneotrix.testnews.data.remote.RemoteDataSource
import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.repository.NewsRepository

class NewsRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
): NewsRepository {
    override suspend fun getCategories(): List<Category> {
        return remoteDataSource.getCategories().list
            .map { MapperData.mapCategoriesResponse(it) }
    }

    override fun getAllNewsByCategory(categoryId: Long) {
        TODO("Not yet implemented")
    }

    override fun getNewsPageByCategory(categoryId: Long, page: Int) {
        TODO("Not yet implemented")
    }

    override fun getNewsDetail(id: Long) {
        TODO("Not yet implemented")
    }

    override fun getCurrentPage(): Int {
        TODO("Not yet implemented")
    }

    override fun getCurrentCategoryId(): Long {
        TODO("Not yet implemented")
    }
}