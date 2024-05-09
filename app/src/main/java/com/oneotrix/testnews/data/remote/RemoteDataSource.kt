package com.oneotrix.testnews.data.remote

import com.oneotrix.testnews.data.Api
import com.oneotrix.testnews.data.remote.response.CategoriesResponse
import com.oneotrix.testnews.data.remote.response.DetailNewsResponse
import com.oneotrix.testnews.data.remote.response.NewsResponse
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: Api
) {
    suspend fun getCategories(): CategoriesResponse {
        return api.getCategories()
    }

    suspend fun isPageEmpty(categoryId: Long, page: Int): Boolean {
        return api.getNews(categoryId, page).list.isEmpty()
    }

    suspend fun getNewsPage(categoryId: Long, page: Int): NewsResponse {
        return api.getNews(categoryId, page)
    }

    suspend fun getDetailNews(id: Long): DetailNewsResponse {
        return api.getDetailNews(id)
    }

}