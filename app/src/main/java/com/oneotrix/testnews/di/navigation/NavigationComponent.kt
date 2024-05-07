package com.oneotrix.testnews.di.navigation

import androidx.navigation.NavController
import com.oneotrix.testnews.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [
        NavigationModule::class
    ]
)
interface NavigationComponent {

    fun navigationController(): NavController

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance activity: MainActivity
        ) : NavigationComponent
    }
}