package com.example.submissionjetpack.ui.detail

import androidx.lifecycle.ViewModel
import com.example.submissionjetpack.data.source.StudioRepository
import com.example.submissionjetpack.data.source.local.entity.DetailEntity

class DetailViewModel(private val studioRepository: StudioRepository) : ViewModel() {
    private lateinit var id: String

    fun setSelectedItem(id: String) {
        this.id = id
    }

    fun getMovieList(): DetailEntity = studioRepository.getDetailMovie(id)

    fun getTvSeriesList(): DetailEntity = studioRepository.getDetailTv(id)
}