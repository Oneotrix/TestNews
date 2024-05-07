package com.oneotrix.testnews.view.news_detail

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.oneotrix.testnews.App
import com.oneotrix.testnews.databinding.FragmentNewsDetailsBinding
import com.oneotrix.testnews.view.BaseFragment
import javax.inject.Inject

class NewsDetailFragment: BaseFragment<FragmentNewsDetailsBinding>(
    FragmentNewsDetailsBinding::inflate
) {
    companion object {
        fun newInstance() = NewsDetailFragment()
    }

    @Inject
    lateinit var viewModelFactory: NewsDetailViewModelFactory

    private val viewModel: NewsDetailViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {

        App.newsComponent.newsDetailFragmentComponentBuilder()
            .build()
            .inject(this@NewsDetailFragment)

        super.onCreate(savedInstanceState)
    }
}