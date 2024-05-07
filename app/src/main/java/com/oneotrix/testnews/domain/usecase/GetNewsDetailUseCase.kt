package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository
import javax.inject.Inject

class GetNewsDetailUseCase @Inject constructor (
    private val newsRepository: NewsRepository
) {
    operator fun invoke(id: Long) = newsRepository.getNewsDetail(id)
}