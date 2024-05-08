package com.oneotrix.testnews.view.news.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oneotrix.testnews.databinding.ItemShortNewsBinding
import com.oneotrix.testnews.domain.models.ShortNews
import com.oneotrix.testnews.utils.Comparator

class NewsAdapter : ListAdapter<ShortNews, NewsViewHolder>(Comparator.newsComparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            binding = ItemShortNewsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}