package com.oneotrix.testnews.view.news

import androidx.lifecycle.ViewModel
import com.oneotrix.testnews.domain.usecase.GetFirstPageNewsByCategory
import com.oneotrix.testnews.domain.usecase.GetNextPageNewsUseCase
import com.oneotrix.testnews.domain.usecase.GetPrevPageNewsUseCase

class NewsViewModel(
    private val getFirsPageNewsByCategoryUseCase: GetFirstPageNewsByCategory,
    private val getPrevPageNewsUseCase: GetPrevPageNewsUseCase,
    private val getNextPageNewsUseCase: GetNextPageNewsUseCase,
): ViewModel() {
}