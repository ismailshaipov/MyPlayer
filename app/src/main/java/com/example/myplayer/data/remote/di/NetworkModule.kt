package com.example.myplayer.data.remote.di

import com.example.myplayer.data.remote.api.DeezerApi
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val networkModule = module {
    single {
        OkHttpClient.Builder().build()
    }

    single {
        Retrofit.Builder()
            .baseUrl("https://api.deezer.com/")
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .client(get())
            .build()
    }

    single<DeezerApi> {
        get<Retrofit>().create()
    }
}