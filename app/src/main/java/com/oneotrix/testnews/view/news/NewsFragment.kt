package com.oneotrix.testnews.view.news

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.oneotrix.testnews.App
import com.oneotrix.testnews.databinding.FragmentNewsBinding
import com.oneotrix.testnews.view.BaseFragment
import javax.inject.Inject

class NewsFragment: BaseFragment<FragmentNewsBinding>(
    FragmentNewsBinding::inflate
) {
    companion object {
        fun newInstance() = NewsFragment()
    }

    @Inject
    lateinit var viewModelFactory: NewsViewModelFactory

    private val viewModel: NewsViewModel by viewModels { viewModelFactory }

    private val categoryId by lazy {
        arguments?.getInt("id") ?: 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        App.newsComponent.newsFragmentComponentBuilder()
            .build()
            .inject(this@NewsFragment)

        super.onCreate(savedInstanceState)
    }

}