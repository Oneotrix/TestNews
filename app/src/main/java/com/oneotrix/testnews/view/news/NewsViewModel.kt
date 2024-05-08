package com.oneotrix.testnews.view.news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oneotrix.testnews.domain.models.ShortNews
import com.oneotrix.testnews.domain.usecase.GetFirstPageNewsByCategory
import com.oneotrix.testnews.domain.usecase.GetNextPageNewsUseCase
import com.oneotrix.testnews.domain.usecase.GetPrevPageNewsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NewsViewModel(
    private val getFirsPageNewsByCategoryUseCase: GetFirstPageNewsByCategory,
    private val getPrevPageNewsUseCase: GetPrevPageNewsUseCase,
    private val getNextPageNewsUseCase: GetNextPageNewsUseCase,
    private val categoryId: Int,
): ViewModel() {

    private val _state = MutableStateFlow(UiState.News())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val count = getFirsPageNewsByCategoryUseCase.countPages(categoryId.toLong())
            val list = if (count!=0) {
                getFirsPageNewsByCategoryUseCase(categoryId = categoryId.toLong(), 0)
            } else {
                _state.value.newsList
            }
            val currentPage = if (count!=0) 1 else 0

            _state.update {
                it.copy(
                    allPages =  count,
                    currentPage = currentPage,
                    newsList = list
                )
            }
        }
    }

    fun nextPage() = viewModelScope.launch {
        if (_state.value.currentPage < _state.value.allPages) {
            _state.update {
                it.copy(
                    currentPage = _state.value.currentPage + 1,
                    newsList = getNextPageNewsUseCase(categoryId.toLong(), _state.value.currentPage - 1)
                )
            }
        }
    }

    fun prevPage() = viewModelScope.launch {
        if (_state.value.currentPage > 1) {
            _state.update {
                it.copy(
                    currentPage = _state.value.currentPage - 1,
                    newsList = getPrevPageNewsUseCase(categoryId.toLong(), _state.value.currentPage - 1)
                )
            }
        }
    }

    sealed class UiState() {
        data class News(
            val allPages: Int = 0,
            val currentPage: Int = 0,
            val newsList: List<ShortNews> = listOf()
        )
    }
}