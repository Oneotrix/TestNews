package com.oneotrix.testnews.di.news.sub

import com.oneotrix.testnews.view.news.NewsFragment
import dagger.Subcomponent

@Subcomponent
interface NewsFragmentComponent {

    fun inject(fragment: NewsFragment)

    @Subcomponent.Builder
    interface Builder {
        fun build() : NewsFragmentComponent
    }
}