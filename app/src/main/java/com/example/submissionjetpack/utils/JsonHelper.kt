package com.example.submissionjetpack.utils

import android.content.Context
import com.example.submissionjetpack.data.source.remote.response.*
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovieList(): List<StudioResponse> {
        val list = ArrayList<StudioResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("Movie.json").toString())
            val listArray = responseObject.getJSONArray("movie")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val title = movie.getString("name")
                val year = movie.getString("tahun")
                val detail = movie.getString("description")
                val genre = movie.getString("genre")
                val rating = movie.getString("rating")
                val img = movie.getString("picture")

                val movieListResponse = StudioResponse(id, title, year, detail, genre, rating, img)
                list.add(movieListResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

    fun loadTvList(): List<StudioResponse> {
        val list = ArrayList<StudioResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("Tv.json").toString())
            val listArray = responseObject.getJSONArray("tv")
            for (i in 0 until listArray.length()) {
                val tv = listArray.getJSONObject(i)

                val id = tv.getString("id")
                val title = tv.getString("name")
                val year = tv.getString("tahun")
                val detail = tv.getString("description")
                val genre = tv.getString("genre")
                val rating = tv.getString("rating")
                val image = tv.getString("picture")

                val tvListResponse = StudioResponse(id, title, year, detail, genre, rating, image)
                list.add(tvListResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

//    fun loadMovieDetail(movieId: String): List<StudioResponse> {
//        val fileName = String.format("Movie.json", movieId)
//        val list = ArrayList<StudioResponse>()
//        try {
//            val result = parsingFileToString(fileName)
//            if (result != null) {
//                val responseObject = JSONObject(result)
//                val listArray = responseObject.getJSONArray("movie")
//                for (i in 0 until listArray.length()) {
//                    val movie = listArray.getJSONObject(i)
//
//                    val id = movie.getString("id")
//                    val title = movie.getString("name")
//                    val year = movie.getString("tahun")
//                    val genre = movie.getString("genre")
//                    val rating = movie.getString("rating")
//                    val detail = movie.getString("description")
//                    val movieImg = movie.getString("picture")
//
//                    val movieDetailResponse = StudioResponse(id, title, year, genre, rating, detail, movieImg)
//                    list.add(movieDetailResponse)
//                }
//            }
//        } catch (e: JSONException) {
//            e.printStackTrace()
//        }
//        return list
//    }
//
//    fun loadTvDetail(tvId: String): List<StudioResponse> {
//        val fileName = String.format("Tv.json", tvId)
//        val list = ArrayList<StudioResponse>()
//        try {
//            val result = parsingFileToString(fileName)
//            if (result != null) {
//                val responseObject = JSONObject(result)
//                val listArray = responseObject.getJSONArray("tv")
//                for (i in 0 until  listArray.length()) {
//                    val tv = listArray.getJSONObject(i)
//
//                    val id = tv.getString("id")
//                    val title = tv.getString("name")
//                    val year = tv.getString("tahun")
//                    val genre = tv.getString("genre")
//                    val rating = tv.getString("rating")
//                    val detail = tv.getString("description")
//                    val tvImg = tv.getString("picture")
//
//                    val tvDetailResponse = StudioResponse(id, title, year, genre, rating, detail, tvImg)
//                    list.add(tvDetailResponse)
//                }
//            }
//        } catch (e: JSONException) {
//            e.printStackTrace()
//        }
//        return list
//    }
}