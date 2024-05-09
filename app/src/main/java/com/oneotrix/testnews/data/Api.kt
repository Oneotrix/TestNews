package com.oneotrix.testnews.data

import com.oneotrix.testnews.data.remote.response.CategoriesResponse
import com.oneotrix.testnews.data.remote.response.DetailNewsResponse
import com.oneotrix.testnews.data.remote.response.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    companion object {
        const val BASE_URL = "http://testtask.sebbia.com/v1/news/"
    }

    @GET("categories")
    suspend fun getCategories(): CategoriesResponse

    @GET("categories/{categoryId}/news")
    suspend fun getNews(
        @Path("categoryId") categoryId: Long,
        @Query("page") page: Int,
    ): NewsResponse

    @GET("details")
    suspend fun getDetailNews(
        @Query("id") id: Long
    ): DetailNewsResponse
}