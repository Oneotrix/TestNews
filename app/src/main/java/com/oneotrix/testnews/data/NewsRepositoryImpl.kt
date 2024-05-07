package com.oneotrix.testnews.data

import com.oneotrix.testnews.domain.repository.NewsRepository

class NewsRepositoryImpl: NewsRepository {
    override fun getCategories() {
        TODO("Not yet implemented")
    }

    override fun getAllNewsByCategory(categoryId: Long) {
        TODO("Not yet implemented")
    }

    override fun getNewsPageByCategory(categoryId: Long, page: Int) {
        TODO("Not yet implemented")
    }

    override fun getNewsDetail(id: Long) {
        TODO("Not yet implemented")
    }

    override fun getCurrentPage(): Int {
        TODO("Not yet implemented")
    }

    override fun getCurrentCategoryId(): Long {
        TODO("Not yet implemented")
    }
}