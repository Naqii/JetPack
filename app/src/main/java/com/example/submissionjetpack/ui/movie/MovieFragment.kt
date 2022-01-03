package com.example.submissionjetpack.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.submissionjetpack.databinding.FragmentMovieBinding
import com.example.submissionjetpack.viewmodel.ViewModelFactory

class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    private lateinit var movieViewModel: MovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireActivity())
        movieViewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
        val movie = movieViewModel.getMovie()

        val adapterMovie = MovieAdapter()
        adapterMovie.setMovie(movie)

        with(binding.movieSeries) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = adapterMovie
        }
    }
}