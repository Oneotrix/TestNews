package com.oneotrix.testnews.view.news_detail

import com.oneotrix.testnews.databinding.FragmentNewsDetailsBinding
import com.oneotrix.testnews.view.BaseFragment

class NewsDetailFragment: BaseFragment<FragmentNewsDetailsBinding>(
    FragmentNewsDetailsBinding::inflate
) {
    companion object {
        fun newInstance() = NewsDetailFragment()
    }
}