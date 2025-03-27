package com.example.csc_teachers.modal

data class publicKey(
    val publicKey: String
)

data class Activity (
    val date : String = "2 feb",
    val time : String = "12pm-2pm",
    val activity : String = "Lecture",
    val course : String = "BCA",
    val status : String = "",
)