package com.oneotrix.testnews.view.news_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oneotrix.testnews.domain.usecase.GetNewsDetailUseCase
import javax.inject.Inject
import javax.inject.Named

class NewsDetailViewModelFactory @Inject constructor(
    private val getNewsDetailUseCase: GetNewsDetailUseCase,
    private val id: Int,
    @Named("title") private val title: String,
    @Named("shortDescription") private val shortDescription: String,
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsDetailViewModel(
            getNewsDetailUseCase = getNewsDetailUseCase,
            id = id,
            title = title,
            shortDescription = shortDescription,
        ) as T
    }

}