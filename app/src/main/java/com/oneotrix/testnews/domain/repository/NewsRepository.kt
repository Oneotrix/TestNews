package com.oneotrix.testnews.domain.repository

import com.oneotrix.testnews.domain.models.Category

interface NewsRepository {

    suspend fun getCategories(): List<Category>

    fun getAllNewsByCategory(categoryId: Long)

    fun getNewsPageByCategory(categoryId: Long, page: Int)

    fun getNewsDetail(id: Long)

    fun getCurrentPage() : Int

    fun getCurrentCategoryId() : Long

}