package com.oneotrix.testnews.data

import com.oneotrix.testnews.data.remote.response.CategoriesResponse
import retrofit2.http.GET

interface Api {
    companion object {
        const val BASE_URL = "http://testtask.sebbia.com/v1/news/"
    }

    @GET("categories")
    suspend fun getCategories(): CategoriesResponse
}