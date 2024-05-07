package com.oneotrix.testnews.di.news

import com.oneotrix.testnews.di.news.modules.NewsRepositoryModule
import com.oneotrix.testnews.di.news.sub.CategoriesFragmentComponent
import com.oneotrix.testnews.di.news.sub.NewsDetailFragmentComponent
import com.oneotrix.testnews.di.news.sub.NewsFragmentComponent
import dagger.Subcomponent

@Subcomponent(
    modules = [
        NewsSubcomponents::class,
        NewsRepositoryModule::class,
    ]
)
interface NewsComponent {

    fun categoriesFragmentComponentBuilder(): CategoriesFragmentComponent.Builder
    fun newsFragmentComponentBuilder(): NewsFragmentComponent.Builder
    fun newsDetailFragmentComponentBuilder(): NewsDetailFragmentComponent.Builder

    @Subcomponent.Builder
    interface Builder {
        fun build() : NewsComponent
    }
}