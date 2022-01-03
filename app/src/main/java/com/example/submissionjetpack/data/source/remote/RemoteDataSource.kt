package com.example.submissionjetpack.data.source.remote

import com.example.submissionjetpack.data.source.remote.response.*
import com.example.submissionjetpack.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper){

    fun getAllMovie(): List<StudioResponse> = jsonHelper.loadMovieList()

    fun getAllTv(): List<StudioResponse> = jsonHelper.loadTvList()

//    fun getDetailMovie(movieId: String): List<MovieResponse> = jsonHelper.loadMovieDetail(movieId)
//
//    fun getDetailTv(tvId: String): List<TvResponse> = jsonHelper.loadTvDetail(tvId)

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }
}