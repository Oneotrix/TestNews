package com.oneotrix.testnews.di.app.modules

import com.oneotrix.testnews.di.app.modules.local.RoomModule
import com.oneotrix.testnews.di.app.modules.local.SharedPrefModule
import dagger.Module

@Module(
    includes = [
        SharedPrefModule::class,
        RoomModule::class,
    ]
)
class LocalModule {
}