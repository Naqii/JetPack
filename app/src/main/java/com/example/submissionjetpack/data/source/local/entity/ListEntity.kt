package com.example.submissionjetpack.data.source.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ListEntity(
    var id: String = "",
    var title: String = "",
    var rating: String = "",
    var year: String = "",
    var img: String = ""
) : Parcelable
