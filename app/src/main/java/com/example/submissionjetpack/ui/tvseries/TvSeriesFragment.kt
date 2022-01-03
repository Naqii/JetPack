package com.example.submissionjetpack.ui.tvseries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.submissionjetpack.databinding.FragmentTvSeriesBinding
import com.example.submissionjetpack.viewmodel.ViewModelFactory

class TvSeriesFragment : Fragment() {

    private lateinit var binding: FragmentTvSeriesBinding
    private lateinit var tvViewModel: TvSeriesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTvSeriesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance(requireActivity())
        tvViewModel = ViewModelProvider(this, factory)[TvSeriesViewModel::class.java]
        val tvSeries = tvViewModel.getTvSeries()

        val adapterTv = TvSeriesAdapter()
        adapterTv.setTvSeries(tvSeries)

        with(binding.tvSeries) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = adapterTv
        }
    }
}