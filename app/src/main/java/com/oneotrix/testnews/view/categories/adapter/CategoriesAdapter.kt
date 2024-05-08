package com.oneotrix.testnews.view.categories.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oneotrix.testnews.databinding.ItemCategoryBinding
import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.utils.Comparator


class CategoriesAdapter(
    private val callback: (Int) -> Unit
) : ListAdapter<Category, CategoriesViewHolder>(Comparator.categoriesComparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        return CategoriesViewHolder(
            binding = ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            callback = callback
        )
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}