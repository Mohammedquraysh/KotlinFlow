package com.example.network

import com.example.model.CommentResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // Get method to call the api ,passing id as a path
    @GET("/comments/{id}")
    suspend fun getComments(@Path("id") id: Int): CommentResponse
}