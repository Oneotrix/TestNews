package com.oneotrix.testnews.view.news_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oneotrix.testnews.domain.usecase.GetNewsDetailUseCase
import javax.inject.Inject

class NewsDetailViewModelFactory @Inject constructor(
    private val getNewsDetailUseCase: GetNewsDetailUseCase
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsDetailViewModel(
            getNewsDetailUseCase
        ) as T
    }

}