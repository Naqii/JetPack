package com.example.submissionjetpack.ui.detail

import com.example.submissionjetpack.utils.DataDummy
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTv = DataDummy.generateDummyTv()[0]
    private val title = dummyMovie.title
    private val titleTv = dummyTv.title

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.setMovieData(title)
        viewModel.setTvSeriesData(titleTv)
    }

    @Test
    fun getMovieData() {
        viewModel.setMovieData(title)
        val movieEntity = viewModel.getMovieData()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.title, movieEntity?.title)
        assertEquals(dummyMovie.image, movieEntity?.image)
        assertEquals(dummyMovie.detail, movieEntity?.detail)
        assertEquals(dummyMovie.genre, movieEntity?.genre)
        assertEquals(dummyMovie.rating, movieEntity?.rating)
        assertEquals(dummyMovie.year, movieEntity?.year)
    }

    @Test
    fun getTvSeriesDetail() {
        viewModel.setTvSeriesData(titleTv)
        val tvEntity = viewModel.getTvSeriesDetail()
        assertNotNull(tvEntity)
        assertEquals(dummyTv.title, tvEntity?.title)
        assertEquals(dummyTv.image, tvEntity?.image)
        assertEquals(dummyTv.detail, tvEntity?.detail)
        assertEquals(dummyTv.genre, tvEntity?.genre)
        assertEquals(dummyTv.rating, tvEntity?.rating)
        assertEquals(dummyTv.year, tvEntity?.year)
    }
}