package com.oneotrix.testnews.view.categories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oneotrix.testnews.domain.usecase.GetCategoriesUseCase
import javax.inject.Inject

class CategoriesViewModelFactory @Inject constructor(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CategoriesViewModel(
            getCategoriesUseCase
        ) as T
    }

}