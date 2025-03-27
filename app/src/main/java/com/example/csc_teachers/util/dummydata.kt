package com.example.csc_teachers.util

import com.example.csc_teachers.modal.Activity

val Teacherlist = listOf(
    Activity(date = "10 April", time = "9am-10am", activity = "Lecture", course = "Math", status = "Appr"),
    Activity(date = "10 Oct", time = "10am-11am", activity = "Lab", course = "Physics", status = "Rej"),
    Activity(date = "10 June", time = "11am-12pm", activity = "Lecture", course = "Chemistry", status = "Sub"),
    Activity(date = "10 Oct", time = "1pm-2pm", activity = "Tutorial", course = "Math", status = "NS"),
    Activity(date = "11 Oct", time = "9am-10am", activity = "Lecture", course = "Biology", status = "Appr"),
    Activity(date = "11 Oct", time = "10am-12pm", activity = "Lab", course = "Computer Science", status = "Sub"),
    Activity(date = "11 Oct", time = "1pm-2pm", activity = "Lecture", course = "English", status = "Rej"),
    Activity(date = "12 Oct", time = "9am-10am", activity = "Lecture", course = "History", status = "NS"),
    Activity(date = "12 Oct", time = "10am-11am", activity = "Tutorial", course = "Geography", status = "Appr"),
    Activity(date = "12 Oct", time = "11am-12pm", activity = "Lecture", course = "Art", status = "Sub"),
    Activity(date = "12 Oct", time = "1pm-2pm", activity = "Lab", course = "Music", status = "Rej"),
    Activity(date = "13 Oct", time = "9am-10am", activity = "Lecture", course = "Physical Education", status = "NS"),
    Activity(date = "13 Oct", time = "10am-11am", activity = "Lecture", course = "Economics", status = "Appr"),
    Activity(date = "13 Oct", time = "11am-12pm", activity = "Tutorial", course = "Civics", status = "Sub"),
    Activity(date = "13 Oct", time = "1pm-2pm", activity = "Lecture", course = "Psychology", status = "Rej"),
    Activity(date = "14 Oct", time = "9am-10am", activity = "Lab", course = "Sociology", status = "NS"),
    Activity(date = "14 Oct", time = "10am-11am", activity = "Lecture", course = "Environmental Science", status = "Appr"),
    Activity(date = "14 Oct", time = "11am-12pm", activity = "Lecture", course = "Statistics", status = "Sub"),
    Activity(date = "14 Oct", time = "1pm-2pm", activity = "Tutorial", course = "Calculus", status = "Rej"),
    Activity(date = "15 Oct", time = "9am-10am", activity = "Lecture", course = "Linear Algebra", status = "NS")
)

data class TeacherStat(val label : String , val value:Float, val total:Float)

val TeacherStats = listOf(
    TeacherStat("Lecture", 50f , 45f),
    TeacherStat("Department Work", 20f , 45f),
    TeacherStat("Event", 10f , 45f),
    TeacherStat("Invigilation", 30f , 45f),
    TeacherStat("Paper Check", 30f , 45f),
    TeacherStat("Library", 10f , 45f),
    TeacherStat("Lunch?Break", 10f , 45f),
    TeacherStat("Other", 30f , 45f),
    )