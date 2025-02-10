package com.example.myplayer.data.repository

import kotlinx.coroutines.flow.Flow

interface TracksRepository {
    fun getTopTracks(): Flow<List<Track>>
    fun searchTracks(query: String): Flow<List<Track>>
}
