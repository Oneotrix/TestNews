package com.oneotrix.testnews.domain.repository

import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.models.DetailNews
import com.oneotrix.testnews.domain.models.ShortNews

interface NewsRepository {

    suspend fun getCategories(): List<Category>

    suspend fun getCountPagesByCategory(categoryId: Long) : Int

    suspend fun getNewsPageByCategory(categoryId: Long, page: Int) : List<ShortNews>

    suspend fun getNewsDetail(id: Long): DetailNews

    fun getCurrentPage() : Int

    fun getCurrentCategoryId() : Long

}