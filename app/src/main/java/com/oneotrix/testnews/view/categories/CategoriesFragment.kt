package com.oneotrix.testnews.view.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.oneotrix.testnews.App
import com.oneotrix.testnews.MainActivity
import com.oneotrix.testnews.R
import com.oneotrix.testnews.databinding.FragmentCategoriesBinding
import com.oneotrix.testnews.view.BaseFragment
import com.oneotrix.testnews.view.categories.adapter.CategoriesAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
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

    private val adapter by lazy {
        CategoriesAdapter { categoryId ->
            navigateToNewsFragment(categoryId)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        App.newsComponent.categoriesFragmentComponentBuilder()
            .build()
            .inject(this@CategoriesFragment)

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        observeState()

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()

    }

    private fun observeState() {
        viewModel.state
            .onEach { adapter.submitList(it) }
            .launchIn(lifecycleScope)
    }

    private fun initRecycler() {
        binding.rvCategories.adapter = adapter
        setDecorator()
    }

    private fun setDecorator() {
        val decorator = DividerItemDecoration(this.context, RecyclerView.VERTICAL)
        binding.rvCategories.addItemDecoration(decorator)
    }

    private fun navigateToNewsFragment(id: Int) {
        val bundle = bundleOf("id" to id)
        MainActivity.navigationComponent.navigationController().navigate(
            R.id.action_categoriesFragment_to_newsFragment,
            bundle,
        )
    }
}