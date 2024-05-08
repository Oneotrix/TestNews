package com.oneotrix.testnews.data.remote

import com.oneotrix.testnews.data.Api
import com.oneotrix.testnews.data.remote.response.CategoriesResponse
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: Api
) {
    suspend fun getCategories(): CategoriesResponse {
        return api.getCategories()
    }

}