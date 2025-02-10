package com.example.myplayer.data.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DeezerTrack(
    val id: Long,
    val title: String,
    val preview: String,
    val duration: Int,
    @SerialName("artist_name")
    val artistName: String,
    @SerialName("cover_medium")
    val coverMedium: String
)