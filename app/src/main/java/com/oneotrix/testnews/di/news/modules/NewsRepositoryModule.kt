package com.oneotrix.testnews.di.news.modules

import com.oneotrix.testnews.data.NewsRepositoryImpl
import com.oneotrix.testnews.data.remote.RemoteDataSource
import com.oneotrix.testnews.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides

@Module
class NewsRepositoryModule {

    @Provides
    fun provideNewsRepository(
        remoteDataSource: RemoteDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(remoteDataSource)
    }
}