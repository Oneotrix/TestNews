package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository

class GetCategoriesUseCase(private val newsRepository: NewsRepository) {
    operator fun invoke() = newsRepository.getCategories()
}