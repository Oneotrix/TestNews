package com.oneotrix.testnews.view.categories.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.oneotrix.testnews.databinding.ItemCategoryBinding
import com.oneotrix.testnews.domain.models.Category

class CategoriesViewHolder(
    private val binding: ItemCategoryBinding,
    private val callback: (Int) -> Unit
) : ViewHolder(binding.root) {

    fun bind(model: Category) = with(binding) {
        tvCategory.text = model.name
        tvCategory.setOnClickListener {
            callback(model.id)
        }
    }

}