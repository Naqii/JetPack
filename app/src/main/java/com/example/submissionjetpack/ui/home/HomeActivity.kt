package com.example.submissionjetpack.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.submissionjetpack.R
import com.example.submissionjetpack.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.studio)
        supportActionBar?.elevation = 0f

        val sectionsPagerAdapter = SectionPagerAdapter(this)
        binding.viewPager.adapter = sectionsPagerAdapter
        TabLayoutMediator(binding.tabs,binding.viewPager){ tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
    }

    companion object {
        private val TAB_TITLES = intArrayOf(
            R.string.movie,
            R.string.tv_series
        )
    }
}