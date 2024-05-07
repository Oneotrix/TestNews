package com.oneotrix.testnews.di.app.modules.remote

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Converter

@Module
class JsonModule {

    @Provides
    fun jsonConvertedFactory(json: Json, contentType: MediaType): Converter.Factory {
        return json.asConverterFactory(contentType)
    }

    @Provides
    fun json(): Json {
        return Json
    }

    @Provides
    fun contentType(): MediaType {
        return "application/json".toMediaType()
    }
}