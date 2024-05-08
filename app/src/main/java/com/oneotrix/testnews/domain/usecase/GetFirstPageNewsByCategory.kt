package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.models.ShortNews
import com.oneotrix.testnews.domain.repository.NewsRepository
import javax.inject.Inject

class GetFirstPageNewsByCategory @Inject constructor(
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke(categoryId: Long, pageId: Int): List<ShortNews> {
        return newsRepository.getNewsPageByCategory(categoryId, pageId)
    }

    suspend fun countPages(categoryId: Long): Int {
        return newsRepository.getCountPagesByCategory(categoryId)
    }

}