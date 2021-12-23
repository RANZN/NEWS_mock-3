package com.ranzan.newsmock_3.model.remote

import retrofit2.http.GET


interface ApiClient {

    companion object {
        private const val key = "4ee96bc2dc32491c8fcae4c40962e52e"
    }

    @GET("v2/top-headlines?country=in&apiKey=$key&page=1")
    suspend fun getData(): ResponseModel
}