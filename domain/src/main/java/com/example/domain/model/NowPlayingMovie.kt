package com.example.domain.model


data class NowPlayingMovie(
    val page:Int,
    val dataMovie: List<Movie>,
    val totalPages:Int,
    val totalResults:Int,
)
