package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository
import javax.inject.Inject

class GetFirstPageNewsByCategory @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(categoryId: Long, pageId: Int) {
        return  newsRepository.getNewsPageByCategory(categoryId, pageId)
    }

}