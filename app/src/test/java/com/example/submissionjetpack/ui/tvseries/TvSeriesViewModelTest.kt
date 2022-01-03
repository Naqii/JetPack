package com.example.submissionjetpack.ui.tvseries

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class TvSeriesViewModelTest {

    private lateinit var viewModel: TvSeriesViewModel

    @Before
    fun setUp() {
        viewModel = TvSeriesViewModel()
    }

    @Test
    fun getTvSeries() {
        val tvSeriesEntities = viewModel.getTvSeries()
        assertNotNull(tvSeriesEntities)
        assertEquals(10, tvSeriesEntities.size)
    }
}