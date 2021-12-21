package com.ranzan.newsmock_3.model.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    companion object {

        private const val BASE_URL = "https://newsapi.org/"
        private fun getRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClient.Builder().build())
                .build()
        }

        val apiClient: ApiClient = getRetrofit().create(ApiClient::class.java)
    }
}