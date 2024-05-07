package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository

class GetPrevPageNewsUseCase(private val newsRepository: NewsRepository) {
    operator fun invoke() {
        val categoryId = newsRepository.getCurrentCategoryId()
        val page = newsRepository.getCurrentPage() - 1
        return newsRepository.getNewsPageByCategory(categoryId = categoryId, page = page)
    }
}