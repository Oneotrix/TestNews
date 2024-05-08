package com.oneotrix.testnews.di.news.sub

import com.oneotrix.testnews.view.news.NewsFragment
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent
interface NewsFragmentComponent {

    fun inject(fragment: NewsFragment)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun categoryId(id: Int) : Builder
        fun build() : NewsFragmentComponent
    }
}