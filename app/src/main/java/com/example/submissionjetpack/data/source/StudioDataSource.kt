package com.example.submissionjetpack.data.source

import com.example.submissionjetpack.data.source.local.entity.*

interface StudioDataSource {
    fun getAllMovie(): List<ListEntity>

    fun getAllTv(): List<ListEntity>

    fun getDetailMovie(id: String): DetailEntity

    fun getDetailTv(id: String): DetailEntity
}