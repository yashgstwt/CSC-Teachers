package com.example.csc_teachers.modal

import org.json.JSONObject
import retrofit2.http.GET

interface CscApiEndpoints {

    @GET("api/public-key")
     suspend fun getPublicApiKey(): publicKey

}

data class User (val userId : Int , val id : Int , val title : String , val completed : Boolean )