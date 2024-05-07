package com.oneotrix.testnews.view.news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oneotrix.testnews.domain.usecase.GetFirstPageNewsByCategory
import com.oneotrix.testnews.domain.usecase.GetNextPageNewsUseCase
import com.oneotrix.testnews.domain.usecase.GetPrevPageNewsUseCase
import javax.inject.Inject

class NewsViewModelFactory @Inject constructor (
    private val getFirstPageNewsByCategoryUseCase: GetFirstPageNewsByCategory,
    private val getPrevPageNewsUseCase: GetPrevPageNewsUseCase,
    private val getNextPageNewsUseCase: GetNextPageNewsUseCase,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(
            getFirstPageNewsByCategoryUseCase,
            getPrevPageNewsUseCase,
            getNextPageNewsUseCase
        ) as T
    }


}