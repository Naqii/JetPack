package com.example.submissionjetpack.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.submissionjetpack.data.source.StudioRepository
import com.example.submissionjetpack.di.Injection
import com.example.submissionjetpack.ui.detail.DetailViewModel
import com.example.submissionjetpack.ui.movie.MovieViewModel
import com.example.submissionjetpack.ui.tvseries.TvSeriesViewModel

class ViewModelFactory private constructor(private val mStudioRepository: StudioRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mStudioRepository) as T
            }
            modelClass.isAssignableFrom(TvSeriesViewModel::class.java) -> {
                return TvSeriesViewModel(mStudioRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                return DetailViewModel(mStudioRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }
}