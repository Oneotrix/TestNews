package com.oneotrix.testnews.data.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class NewsResponse(
    val code: Int,
    val list: List<SingleNews>
) {
    @Serializable
    data class SingleNews(
        val date: String,
        val id: Int,
        val shortDescription: String,
        val title: String
    )
}