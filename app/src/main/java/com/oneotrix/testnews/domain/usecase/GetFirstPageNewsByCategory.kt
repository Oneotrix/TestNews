package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository

class GetFirstPageNewsByCategory(private val newsRepository: NewsRepository) {
    operator fun invoke(categoryId: Long, pageId: Int) {
        return  newsRepository.getNewsPageByCategory(categoryId, pageId)
    }

}