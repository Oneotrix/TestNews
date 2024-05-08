package com.oneotrix.testnews.utils

import androidx.recyclerview.widget.DiffUtil
import com.oneotrix.testnews.domain.models.Category

object Comparator {

    val categoriesComparator = object : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.name == newItem.name
        }

    }

}