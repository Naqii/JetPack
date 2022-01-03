package com.example.submissionjetpack.data.source.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailEntity(
    var id: String = "",
    var title: String = "",
    var detail: String = "",
    var year: String = "",
    var genre: String = "",
    var rating: String = "",
    var img: String = ""
) : Parcelable
