package com.oneotrix.testnews.view.categories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.usecase.GetCategoriesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CategoriesViewModel(
    private val getCategoriesUseCase: GetCategoriesUseCase
): ViewModel() {

    private val _state = MutableStateFlow<List<Category>>(listOf())
    val state = _state.asStateFlow()

    init {
        fetchCategories()
    }

    private fun fetchCategories() = viewModelScope.launch {
        getCategoriesUseCase().also {
            _state.value = it
        }
    }

}