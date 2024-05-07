package com.oneotrix.testnews.view.categories

import com.oneotrix.testnews.databinding.FragmentCategoriesBinding
import com.oneotrix.testnews.view.BaseFragment

class CategoriesFragment: BaseFragment<FragmentCategoriesBinding>(
    FragmentCategoriesBinding::inflate
) {

    companion object {
        fun newInstance() = CategoriesFragment()
    }



}