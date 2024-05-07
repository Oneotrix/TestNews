package com.oneotrix.testnews.di.news

import com.oneotrix.testnews.di.news.sub.CategoriesFragmentComponent
import com.oneotrix.testnews.di.news.sub.NewsDetailFragmentComponent
import com.oneotrix.testnews.di.news.sub.NewsFragmentComponent
import dagger.Module

@Module(subcomponents = [
    CategoriesFragmentComponent::class,
    NewsFragmentComponent::class,
    NewsDetailFragmentComponent::class,
])
class NewsSubcomponents {
}