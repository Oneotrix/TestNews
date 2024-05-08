package com.oneotrix.testnews.data.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class CategoriesResponse(
    val code: Int,
    val list: List<Category>
) {
    @Serializable
    data class Category(
        val id: Int,
        val name: String
    )
}