package com.oneotrix.testnews.view.categories

import androidx.lifecycle.ViewModel
import com.oneotrix.testnews.domain.usecase.GetCategoriesUseCase

class CategoriesViewModel(
    private val getCategoriesUseCase: GetCategoriesUseCase
): ViewModel() {

}