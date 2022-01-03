package com.example.submissionjetpack.ui.tvseries

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.submissionjetpack.data.source.local.entity.ListEntity
import com.example.submissionjetpack.databinding.StudioItemBinding
import com.example.submissionjetpack.ui.detail.DetailActivity

class TvSeriesAdapter : RecyclerView.Adapter<TvSeriesAdapter.ContentHolder>() {
    private val listTvSeries = ArrayList<ListEntity>()

    @SuppressLint("NotifyDataSetChanged")
    fun setTvSeries(tvSeries: List<ListEntity>?) {
        if (tvSeries == null) return
        this.listTvSeries.clear()
        this.listTvSeries.addAll(tvSeries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvSeriesAdapter.ContentHolder {
        val itemTvSeries = StudioItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContentHolder(itemTvSeries)
    }

    override fun onBindViewHolder(holder: TvSeriesAdapter.ContentHolder, position: Int) {
        holder.bind(listTvSeries[position])
    }

    override fun getItemCount(): Int = listTvSeries.size

    inner class ContentHolder(private val binding: StudioItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvSeries: ListEntity) {

            with(binding) {
                titleStudio.text = tvSeries.title
                ratingStudio.text = tvSeries.rating
                yearStudio.text = tvSeries.year
                Glide.with(itemView.context)
                    .load(tvSeries.img)
                    .into(binding.imageStudio)

                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.CONTENT_DATA, tvSeries.id)
                    itemView.context.startActivity(intent)
                }
            }
//            binding.titleStudio.text = tvSeries.title
//            binding.ratingStudio.text = tvSeries.rating.toString()
//            binding.yearStudio.text = tvSeries.year
//            Glide.with(itemView.context)
//                .load(tvSeries.image)
//                .into(binding.imageStudio)
//
//            itemView.setOnClickListener{
//                val intent = Intent(itemView.context, DetailActivity::class.java)
//                intent.putExtra(DetailActivity.CONTENT_DATA, tvSeries)
//                intent.putExtra(DetailActivity.TYPE_DATA, "tv_series")
//                itemView.context.startActivity(intent)
//            }
        }
    }
}