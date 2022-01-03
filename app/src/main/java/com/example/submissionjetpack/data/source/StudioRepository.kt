package com.example.submissionjetpack.data.source

import com.example.submissionjetpack.data.source.local.entity.*
import com.example.submissionjetpack.data.source.remote.RemoteDataSource

class StudioRepository private constructor(private val remoteDataSource: RemoteDataSource) :
    StudioDataSource {

    override fun getAllMovie(): ArrayList<ListEntity> {
        val movieResponses = remoteDataSource.getAllMovie()
        val movieList = ArrayList<ListEntity>()
        for (response in movieResponses) {
            val movie = ListEntity(
                response.id,
                response.title,
                response.rating,
                response.year,
                response.img)
            movieList.add(movie)
        }
        return movieList
    }

    override fun getAllTv(): ArrayList<ListEntity> {
        val tvResponses = remoteDataSource.getAllTv()
        val tvList = ArrayList<ListEntity>()
        for (response in tvResponses) {
            val tv = ListEntity(
                response.id,
                response.title,
                response.rating,
                response.year,
                response.img)
            tvList.add(tv)
        }
        return tvList
    }

    override fun getDetailMovie(id: String): DetailEntity {
        val movieResponses = remoteDataSource.getAllMovie()
        lateinit var movie: DetailEntity
        for (response in movieResponses) {
            if (response.id == id) {
                movie = DetailEntity(
                    response.id,
                    response.title,
                    response.year,
                    response.detail,
                    response.genre,
                    response.rating,
                    response.img)
            }
        }
        return movie
    }

    override fun getDetailTv(id: String): DetailEntity {
        val tvResponses = remoteDataSource.getAllTv()
        lateinit var tv: DetailEntity
        for (response in tvResponses) {
            if (response.id == id) {
                tv = DetailEntity(
                    response.id,
                    response.title,
                    response.year,
                    response.detail,
                    response.genre,
                    response.rating,
                    response.img)
            }
        }
        return tv
    }

    companion object {
        @Volatile
        private var instance: StudioRepository? = null

        fun getInstance(remoteData: RemoteDataSource): StudioRepository =
            instance ?: synchronized(this) {
                instance ?: StudioRepository(remoteData).apply { instance = this }
            }
    }
}