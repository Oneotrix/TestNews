package com.oneotrix.testnews.di.news.sub

import com.oneotrix.testnews.view.categories.CategoriesFragment
import dagger.Subcomponent

@Subcomponent
interface CategoriesFragmentComponent {

    fun inject(fragment: CategoriesFragment)

    @Subcomponent.Builder
    interface Builder {
        fun build() : CategoriesFragmentComponent
    }
}