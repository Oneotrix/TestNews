package com.oneotrix.testnews.view.news

import com.oneotrix.testnews.databinding.FragmentNewsBinding
import com.oneotrix.testnews.view.BaseFragment

class NewsFragment: BaseFragment<FragmentNewsBinding>(
    FragmentNewsBinding::inflate
) {
    companion object {
        fun newInstance() = NewsFragment()
    }
}