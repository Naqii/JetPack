package com.example.submissionjetpack.ui.home

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.submissionjetpack.ui.movie.MovieFragment
import com.example.submissionjetpack.ui.tvseries.TvSeriesFragment

class SectionPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment =
        when (position) {
            0 -> MovieFragment()
            1 -> TvSeriesFragment()
            else -> Fragment()
        }
}