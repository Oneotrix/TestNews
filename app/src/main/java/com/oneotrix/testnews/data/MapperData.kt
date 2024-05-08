package com.oneotrix.testnews.data

import com.oneotrix.testnews.data.remote.response.CategoriesResponse
import com.oneotrix.testnews.domain.models.Category

object MapperData {
    fun mapCategoriesResponse(response: CategoriesResponse.Category): Category {
        return Category(
            id = response.id,
            name = response.name
        )
    }


}