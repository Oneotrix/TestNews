package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.repository.NewsRepository
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(
    private val newsRepository: NewsRepository,
) {
    suspend operator fun invoke() : List<Category> = newsRepository.getCategories()
}