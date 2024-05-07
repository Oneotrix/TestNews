package com.oneotrix.testnews.di.news.sub

import com.oneotrix.testnews.view.news_detail.NewsDetailFragment
import dagger.Subcomponent

@Subcomponent
interface NewsDetailFragmentComponent {

    fun inject(fragment: NewsDetailFragment)

    @Subcomponent.Builder
    interface Builder {
        fun build() : NewsDetailFragmentComponent
    }
}