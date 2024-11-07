package com.example.data.model.dto.result

import com.google.gson.annotations.SerializedName

data class ResultDatesMovieDto(
    @SerializedName("maximum")
    val maximum: String,
    @SerializedName("minimum")
    val minimum: String
)
