package com.oneotrix.testnews.di.app

import com.oneotrix.testnews.di.navigation.NavigationComponent
import com.oneotrix.testnews.di.news.NewsComponent
import dagger.Module

@Module(subcomponents = [
    NewsComponent::class,
    NavigationComponent::class,
])
class AppSubcomponents {
}