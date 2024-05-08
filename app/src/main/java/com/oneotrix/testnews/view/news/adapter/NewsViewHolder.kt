package com.oneotrix.testnews.view.news.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.oneotrix.testnews.databinding.ItemShortNewsBinding
import com.oneotrix.testnews.domain.models.ShortNews

class NewsViewHolder(
    private val binding: ItemShortNewsBinding
) : ViewHolder(binding.root) {


    fun bind(model: ShortNews) {
        binding.tvTitle.text = model.title
        binding.tvDescription.text = model.shortDescription
        binding.tvDate.text = model.date
    }

}