package com.oneotrix.testnews.view.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.oneotrix.testnews.App
import com.oneotrix.testnews.databinding.FragmentNewsBinding
import com.oneotrix.testnews.view.BaseFragment
import com.oneotrix.testnews.view.news.adapter.NewsAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
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

    private val adapter by lazy {
        NewsAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        App.newsComponent.newsFragmentComponentBuilder()
            .categoryId(categoryId)
            .build()
            .inject(this@NewsFragment)

        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeState()
        setupListeners()
        initRecycler()
    }

    private fun setupListeners() {
        binding.icNext.setOnClickListener {
            viewModel.nextPage()
        }
        binding.icPrev.setOnClickListener {
            viewModel.prevPage()
        }
    }

    private fun observeState() {
        viewModel.state
            .onEach { state->
                adapter.submitList(state.newsList)
                binding.tvCurrentPage.text = state.currentPage.toString()
                binding.tvAllPage.text = state.allPages.toString()
            }
            .launchIn(lifecycleScope)
    }

    private fun initRecycler() {
        binding.rvNews.adapter = adapter
        setDecorator()
    }

    private fun setDecorator() {
        val decorator = DividerItemDecoration(this.context, RecyclerView.VERTICAL)
        binding.rvNews.addItemDecoration(decorator)
    }
}