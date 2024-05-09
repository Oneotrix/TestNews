package com.oneotrix.testnews.view.news_detail

import android.text.Html
import android.text.Spanned
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oneotrix.testnews.domain.usecase.GetNewsDetailUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NewsDetailViewModel(
    private val getNewsDetailUseCase: GetNewsDetailUseCase,
    private val id: Int,
    private val title: String,
    private val shortDescription: String,
): ViewModel() {

    private val _state = MutableStateFlow(UiState.DetailNews())
    val state = _state.asStateFlow()


    init {
        _state.update {
            it.copy(
                title = title,
                shortDescription = shortDescription
            )
        }
        fetchFullDescription()
    }

    private fun fetchFullDescription() = viewModelScope.launch {
        getNewsDetailUseCase(id.toLong())
            .let { description ->
                Html.fromHtml(description, Html.FROM_HTML_MODE_LEGACY)
            }
            .also { spanned ->
                _state.update {
                    it.copy(
                        fullDescription = spanned
                    )
                }
            }
    }

    sealed class UiState() {
        data class DetailNews(
            val title: String = "",
            val shortDescription: String = "",
            val fullDescription: Spanned? = null
        ) : UiState()
    }

}