package com.oneotrix.testnews.data

import com.oneotrix.testnews.data.remote.response.CategoriesResponse
import com.oneotrix.testnews.data.remote.response.DetailNewsResponse
import com.oneotrix.testnews.data.remote.response.NewsResponse
import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.models.DetailNews
import com.oneotrix.testnews.domain.models.ShortNews

object MapperData {
    fun mapCategoriesResponse(response: CategoriesResponse.Category): Category {
        return Category(
            id = response.id,
            name = response.name
        )
    }

    fun mapNewsResponse(response: NewsResponse.SingleNews): ShortNews {
        return ShortNews(
            date =  response.date,
            id = response.id,
            shortDescription = response.shortDescription,
            title = response.title
        )
    }

    fun mapDetailNewsResponse(response: DetailNewsResponse.News): DetailNews {
        return DetailNews(
            date = response.date,
            fullDescription = response.fullDescription,
            id = response.id,
            shortDescription = response.shortDescription,
            title = response.title
        )
    }


}