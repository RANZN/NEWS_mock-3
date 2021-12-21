package com.ranzan.newsmock_3.model.remote

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bumptech.glide.Glide
import com.google.gson.annotations.SerializedName
import com.ranzan.newsmock_3.R

data class ResponseModel(

    @field:SerializedName("totalResults")
    val totalResults: Int? = null,

    @field:SerializedName("articles")
    val articles: List<ArticlesItem?>? = null,

    @field:SerializedName("status")
    val status: String? = null
)

data class Source(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null
)


@Entity(tableName = "article")
data class ArticlesItem(

    @PrimaryKey
    val id: Int? = null,

    @field:SerializedName("publishedAt")
    val publishedAt: String? = null,

    @field:SerializedName("author")
    val author: String? = null,

    @field:SerializedName("urlToImage")
    val urlToImage: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("source")
    val source: Source? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("content")
    val content: String? = null
)

@BindingAdapter("android:loadImage")
fun loadImage(imageView: ImageView, url: String) {
    Glide.with(imageView).load(url).placeholder(R.drawable.broken_image).into(imageView)
}
