package com.oneotrix.testnews.view.categories

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.oneotrix.testnews.App
import com.oneotrix.testnews.databinding.FragmentCategoriesBinding
import com.oneotrix.testnews.view.BaseFragment
import javax.inject.Inject

class CategoriesFragment: BaseFragment<FragmentCategoriesBinding>(
    FragmentCategoriesBinding::inflate
) {
    companion object {
        fun newInstance() = CategoriesFragment()
    }

    @Inject
    lateinit var viewModelFactory: CategoriesViewModelFactory

    private val viewModel: CategoriesViewModel by viewModels { viewModelFactory }


    override fun onCreate(savedInstanceState: Bundle?) {
        App.newsComponent.categoriesFragmentComponentBuilder()
            .build()
            .inject(this@CategoriesFragment)

        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}