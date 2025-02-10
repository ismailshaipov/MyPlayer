package com.example.myplayer.data.mappers

import com.example.myplayer.data.remote.models.DeezerTrack

fun DeezerTrack.toDomain() = Track(
    id = id,
    title = title,
    artistName = artistName,
    coverUrl = coverMedium,
    previewUrl = preview,
    duration = duration
)