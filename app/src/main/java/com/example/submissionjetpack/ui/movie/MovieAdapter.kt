package com.example.submissionjetpack.ui.movie

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.submissionjetpack.data.source.local.entity.ListEntity
import com.example.submissionjetpack.databinding.StudioItemBinding
import com.example.submissionjetpack.ui.detail.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ContentHolder>() {
    private val listMovie = ArrayList<ListEntity>()

    @SuppressLint("NotifyDataSetChanged")
    fun setMovie(movie: List<ListEntity>?) {
        if (movie == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movie)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentHolder {
        val itemMovie =
            StudioItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentHolder(itemMovie)
    }

    override fun onBindViewHolder(holder: ContentHolder, position: Int) {
        holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int = listMovie.size

    inner class ContentHolder(private val binding: StudioItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: ListEntity) {

            with(binding) {
                titleStudio.text = movie.title
                ratingStudio.text = movie.rating
                yearStudio.text = movie.year
                Glide.with(itemView.context)
                    .load(movie.img)
                    .into(binding.imageStudio)

                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.CONTENT_DATA, movie.id)
                    itemView.context.startActivity(intent)
                }
            }

//            binding.titleStudio.text = movie.title
//            binding.ratingStudio.text = movie.rating.toString()
//            binding.yearStudio.text = movie.year
//            Glide.with(itemView.context)
//                .load(movie.image)
//                .into(binding.imageStudio)
//
//            itemView.setOnClickListener {
//                val intent = Intent(itemView.context, DetailActivity::class.java)
//                intent.putExtra(DetailActivity.CONTENT_DATA, movie)
//                intent.putExtra(DetailActivity.TYPE_DATA, "movies")
//                itemView.context.startActivity(intent)
//            }
        }
    }
}