package com.example.csc_teachers.modal

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



    fun apiRequest() : CscApiEndpoints {

        return  Retrofit.Builder()
            .baseUrl("http://192.168.1.136:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CscApiEndpoints::class.java)
    }

