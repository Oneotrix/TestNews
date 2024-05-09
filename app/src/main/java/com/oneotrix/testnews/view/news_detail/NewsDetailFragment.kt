package com.oneotrix.testnews.view.news_detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.oneotrix.testnews.App
import com.oneotrix.testnews.databinding.FragmentNewsDetailsBinding
import com.oneotrix.testnews.view.BaseFragment
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
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

    private val newsId: Int by lazy {
        requireArguments().getInt("id", 0)
    }

    private val title: String by lazy {
        requireArguments().getString("title", "")
    }

    private val shortDescription: String by lazy {
        requireArguments().getString("shortDescription", "")
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        App.newsComponent.newsDetailFragmentComponentBuilder()
            .id(newsId)
            .title(title)
            .shortDescription(shortDescription)
            .build()
            .inject(this@NewsDetailFragment)

        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeState()
    }

    private fun observeState() = with(binding) {
        viewModel.state
            .onEach { state ->
                tvTitle.text = state.title
                tvShortDescription.text = state.shortDescription
                tvFullDescription.text = state.fullDescription
            }
            .launchIn(lifecycleScope)
    }
}