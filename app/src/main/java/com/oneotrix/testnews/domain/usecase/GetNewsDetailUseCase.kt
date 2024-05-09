package com.oneotrix.testnews.domain.usecase

import com.oneotrix.testnews.domain.repository.NewsRepository
import javax.inject.Inject

class GetNewsDetailUseCase @Inject constructor (
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke(id: Long): String = newsRepository.getNewsDetail(id).fullDescription
}