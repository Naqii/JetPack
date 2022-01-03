package com.example.submissionjetpack.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StudioResponse (
    var id: String = "",
    var title: String = "",
    var year: String = "",
    var detail: String = "",
    var genre: String = "",
    var rating: String = "",
    var img: String = ""
) : Parcelable