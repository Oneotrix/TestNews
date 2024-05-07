package com.oneotrix.testnews

import android.app.Application
import com.oneotrix.testnews.di.app.AppComponent
import com.oneotrix.testnews.di.app.DaggerAppComponent
import com.oneotrix.testnews.di.navigation.NavigationComponent
import com.oneotrix.testnews.di.news.NewsComponent

class App : Application() {

    companion object {
        private lateinit var appComponent: AppComponent
        lateinit var newsComponent: NewsComponent
        lateinit var navigationComponentFactory: NavigationComponent.Factory
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory().create(this@App)
        newsComponent = appComponent.provideNewsComponentBuilder().build()
        navigationComponentFactory = appComponent.provideNavigationComponentFactory()

    }
}