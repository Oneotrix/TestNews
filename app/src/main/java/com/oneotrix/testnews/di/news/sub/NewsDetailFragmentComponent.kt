package com.oneotrix.testnews.di.news.sub

import com.oneotrix.testnews.view.news_detail.NewsDetailFragment
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent
interface NewsDetailFragmentComponent {

    fun inject(fragment: NewsDetailFragment)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun id(id: Int) : Builder
        @BindsInstance
        fun title(@Named("title") title: String) : Builder
        @BindsInstance
        fun shortDescription(@Named("shortDescription") shortDescription: String) : Builder

        fun build() : NewsDetailFragmentComponent
    }
}