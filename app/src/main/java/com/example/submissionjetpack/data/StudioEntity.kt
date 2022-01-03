package com.example.submissionjetpack.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StudioEntity (
    var title: String,
    var detail: String,
    var year: String,
    var genre: String,
    var rating: Double,
    var image: Int
):Parcelable