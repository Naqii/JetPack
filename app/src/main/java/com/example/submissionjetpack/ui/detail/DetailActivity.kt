package com.example.submissionjetpack.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.submissionjetpack.data.source.local.entity.DetailEntity
import com.example.submissionjetpack.data.source.local.entity.ListEntity
import com.example.submissionjetpack.databinding.ActivityDetailBinding
import com.example.submissionjetpack.viewmodel.ViewModelFactory

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var detailViewModel: DetailViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            elevation = 0f
            setDisplayHomeAsUpEnabled(true)
        }

        val type = intent.getStringExtra(TYPE_DATA)
        val factory = ViewModelFactory.getInstance(this)
        detailViewModel =
            ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val content = intent.getParcelableExtra<ListEntity>(CONTENT_DATA)

        content?.id?.let { detailViewModel.setSelectedItem(it) }

        if (type == "movies") {
            content?.title?.let { setActionBarTitle(it) }
            view(detailViewModel.getMovieList())
        } else {
            content?.title?.let { setActionBarTitle(it) }
            view(detailViewModel.getTvSeriesList())
        }
    }

    private fun view(studioEntity: DetailEntity) {
        with(binding) {
            detailTitle.text = studioEntity.title
            detailYear.text = studioEntity.year
            detailRating.text = studioEntity.rating
            detailGenre.text = studioEntity.genre
            overview.text = studioEntity.detail
            Glide.with(this@DetailActivity)
                .load(studioEntity.img)
                .into(detailImage)
        }

    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    companion object {
        const val CONTENT_DATA = "content_data"
        const val TYPE_DATA = "type_data"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}