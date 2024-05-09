package com.oneotrix.testnews.data.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class DetailNewsResponse(
    val code: Int,
    val news: News
) {
    @Serializable
    data class News(
        val date: String,
        val fullDescription: String,
        val id: Int,
        val shortDescription: String,
        val title: String
    )
}