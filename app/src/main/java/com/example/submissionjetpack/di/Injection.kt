package com.example.submissionjetpack.di

import android.content.Context
import com.example.submissionjetpack.data.source.StudioRepository
import com.example.submissionjetpack.data.source.remote.RemoteDataSource
import com.example.submissionjetpack.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): StudioRepository {
        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return StudioRepository.getInstance(remoteDataSource)
    }
}