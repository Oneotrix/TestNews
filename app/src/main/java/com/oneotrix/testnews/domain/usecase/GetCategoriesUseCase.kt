package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(
    private val newsRepository: NewsRepository,
) {
    operator fun invoke() = newsRepository.getCategories()
}