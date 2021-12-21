package com.ranzan.newsmock_3.model.remote

import retrofit2.http.GET


interface ApiClient {

    companion object {
        private const val key = "4ee96bc2dc32491c8fcae4c40962e52e"
    }

    @GET("v2/everything?q=Apple&from=2021-12-20&sortBy=popularity&apiKey=4ee96bc2dc32491c8fcae4c40962e52e")
    suspend fun getData(): ResponseModel
}