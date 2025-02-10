package com.example.myplayer.data.remote.models

import kotlinx.serialization.Serializable

@Serializable
data class DeezerResponse(
    val tracks: Tracks
) {
    @Serializable
    data class Tracks(
        val data: List<DeezerTrack>
    )
}