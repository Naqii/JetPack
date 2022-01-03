package com.example.submissionjetpack.ui.movie

import androidx.lifecycle.ViewModel
import com.example.submissionjetpack.data.source.StudioRepository
import com.example.submissionjetpack.data.source.local.entity.ListEntity

class MovieViewModel(private val studioRepository: StudioRepository): ViewModel() {
    fun getMovie(): List<ListEntity> = studioRepository.getAllMovie()
}