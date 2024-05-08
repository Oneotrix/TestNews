package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.models.ShortNews
import com.oneotrix.testnews.domain.repository.NewsRepository
import javax.inject.Inject

class GetNextPageNewsUseCase @Inject constructor (
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke(categoryId: Long, page: Int): List<ShortNews>{
        return newsRepository.getNewsPageByCategory(categoryId = categoryId, page = page + 1)
    }
}