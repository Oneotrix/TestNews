package com.oneotrix.testnews.di.app

import android.content.Context
import com.oneotrix.testnews.di.app.modules.LocalModule
import com.oneotrix.testnews.di.app.modules.RemoteModule
import com.oneotrix.testnews.di.navigation.NavigationComponent
import com.oneotrix.testnews.di.news.NewsComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppSubcomponents::class,
        LocalModule::class,
        RemoteModule::class,
    ]
)
@Singleton
interface AppComponent {

    fun provideNewsComponentBuilder(): NewsComponent.Builder

    fun provideNavigationComponentFactory() : NavigationComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ) : AppComponent
    }
}