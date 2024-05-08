package com.oneotrix.testnews.utils

import androidx.recyclerview.widget.DiffUtil
import com.oneotrix.testnews.domain.models.Category
import com.oneotrix.testnews.domain.models.ShortNews

object Comparator {

    val categoriesComparator = object : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.name == newItem.name
        }

    }

    val newsComparator = object : DiffUtil.ItemCallback<ShortNews>() {
        override fun areItemsTheSame(oldItem: ShortNews, newItem: ShortNews): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ShortNews, newItem: ShortNews): Boolean {
            return oldItem.date == newItem.date
                    && oldItem.title == newItem.title
                    && oldItem.shortDescription == newItem.shortDescription
        }

    }

}