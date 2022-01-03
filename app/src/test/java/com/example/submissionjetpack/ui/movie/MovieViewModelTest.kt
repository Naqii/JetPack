package com.example.submissionjetpack.ui.movie

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovie() {
        val MovieEntities = viewModel.getMovie()
        assertNotNull(MovieEntities)
        assertEquals(10, MovieEntities.size)
    }
}