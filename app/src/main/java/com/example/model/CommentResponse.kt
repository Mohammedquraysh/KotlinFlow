package com.example.model

import com.google.gson.annotations.SerializedName

//class CommentResponse :
//
data class CommentResponse(
    val postId: Int?=null,
    val id: Int?=null,
    val email: String?=null,
    val name:String?=null,

    @SerializedName("body")
    val comment: String?=null
)//    ArrayList<CommentResponseItem>()