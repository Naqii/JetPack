package com.example.submissionjetpack.ui.tvseries

import androidx.lifecycle.ViewModel
import com.example.submissionjetpack.data.source.StudioRepository
import com.example.submissionjetpack.data.source.local.entity.ListEntity

class TvSeriesViewModel(private val studioRepository: StudioRepository) : ViewModel() {
    fun getTvSeries(): List<ListEntity> = studioRepository.getAllTv()
}