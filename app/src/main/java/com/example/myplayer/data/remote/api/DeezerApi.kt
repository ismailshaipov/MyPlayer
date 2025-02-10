package com.example.myplayer.data.remote.api


import com.example.myplayer.data.remote.models.DeezerResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DeezerApi {
    @GET("chart")
    suspend fun getTopTracks(): Response<DeezerResponse>

    @GET("search")
    suspend fun searchTracks(
        @Query("q") query: String
    ): Response<DeezerResponse>
}
