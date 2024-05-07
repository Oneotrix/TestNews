package com.oneotrix.testnews.view.news_detail

import androidx.lifecycle.ViewModel
import com.oneotrix.testnews.domain.usecase.GetNewsDetailUseCase

class NewsDetailViewModel(
    private val getNewsDetailUseCase: GetNewsDetailUseCase
): ViewModel() {
}