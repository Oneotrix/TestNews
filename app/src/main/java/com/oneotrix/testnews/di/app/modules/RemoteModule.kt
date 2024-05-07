package com.oneotrix.testnews.di.app.modules

import com.oneotrix.testnews.di.app.modules.remote.JsonModule
import com.oneotrix.testnews.di.app.modules.remote.OkHttpModule
import com.oneotrix.testnews.di.app.modules.remote.RetrofitModule
import dagger.Module

@Module(
    includes = [
        JsonModule::class,
        OkHttpModule::class,
        RetrofitModule::class
    ]
)
class RemoteModule {
}