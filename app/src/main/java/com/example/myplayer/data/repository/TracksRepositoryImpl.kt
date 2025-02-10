package com.example.myplayer.data.repository

import com.example.myplayer.data.mappers.toDomain
import com.example.myplayer.data.remote.api.DeezerApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TracksRepositoryImpl (
    private val api: DeezerApi
) : TracksRepository {
    override fun getTopTracks(): Flow<List<Track>> = flow {
        emit(api.getTopTracks().body()?.tracks?.data?.map { it.toDomain() } ?: emptyList())
    }

    override fun searchTracks(query: String): Flow<List<Track>> = flow {
        emit(api.searchTracks(query).body()?.tracks?.data?.map { it.toDomain() } ?: emptyList())
    }
}
)