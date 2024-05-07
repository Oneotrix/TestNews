package com.oneotrix.testnews.di.navigation

import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.oneotrix.testnews.MainActivity
import com.oneotrix.testnews.R
import dagger.Module
import dagger.Provides

@Module
class NavigationModule {
    @Provides
    fun navigation(
        activity: MainActivity
    ): NavController {
        return Navigation.findNavController(activity, R.id.fragmentContainer)
    }
}