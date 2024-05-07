package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository

class GetNewsDetailUseCase(private val newsRepository: NewsRepository) {
    operator fun invoke(id: Long) = newsRepository.getNewsDetail(id)
}