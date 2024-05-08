package com.oneotrix.testnews.domain.repository

import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.models.ShortNews

interface NewsRepository {

    suspend fun getCategories(): List<Category>

    suspend fun getCountPagesByCategory(categoryId: Long) : Int

    suspend fun getNewsPageByCategory(categoryId: Long, page: Int) : List<ShortNews>

    fun getNewsDetail(id: Long)

    fun getCurrentPage() : Int

    fun getCurrentCategoryId() : Long

}