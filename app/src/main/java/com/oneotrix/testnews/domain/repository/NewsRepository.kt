package com.oneotrix.testnews.domain.repository

interface NewsRepository {

    fun getCategories()

    fun getAllNewsByCategory(categoryId: Long)

    fun getNewsPageByCategory(categoryId: Long, page: Int)

    fun getNewsDetail(id: Long)

    fun getCurrentPage() : Int

    fun getCurrentCategoryId() : Long

}