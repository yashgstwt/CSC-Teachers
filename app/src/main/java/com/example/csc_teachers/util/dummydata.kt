package com.example.csc_teachers.util

import com.example.csc_teachers.modal.Activity

val Teacherlist = listOf(
Activity(date = "10 April", time = "9am-10am", activity = "Lecture", course = "Math", duration = "1h 45min"),
Activity(date = "10 Oct", time = "10am-11am", activity = "Lab", course = "Physics", duration = "1h"),
Activity(date = "10 june", time = "11am-12pm", activity = "Lecture", course = "Chemistry", duration = "1h"),
Activity(date = "10 Oct", time = "1pm-2pm", activity = "Tutorial", course = "Math", duration = "1h"),
Activity(date = "11 Oct", time = "9am-10am", activity = "Lecture", course = "Biology", duration = "1h"),
Activity(date = "11 Oct", time = "10am-12pm", activity = "Lab", course = "Computer Science", duration = "2h"),
Activity(date = "11 Oct", time = "1pm-2pm", activity = "Lecture", course = "English", duration = "1h"),
Activity(date = "12 Oct", time = "9am-10am", activity = "Lecture", course = "History", duration = "1h"),
Activity(date = "12 Oct", time = "10am-11am", activity = "Tutorial", course = "Geography", duration = "1h"),
Activity(date = "12 Oct", time = "11am-12pm", activity = "Lecture", course = "Art", duration = "1h"),
Activity(date = "12 Oct", time = "1pm-2pm", activity = "Lab", course = "Music", duration = "1h"),
Activity(date = "13 Oct", time = "9am-10am", activity = "Lecture", course = "Physical Education", duration = "1h"),
Activity(date = "13 Oct", time = "10am-11am", activity = "Lecture", course = "Economics", duration = "1h"),
Activity(date = "13 Oct", time = "11am-12pm", activity = "Tutorial", course = "Civics", duration = "1h"),
Activity(date = "13 Oct", time = "1pm-2pm", activity = "Lecture", course = "Psychology", duration = "1h"),
Activity(date = "14 Oct", time = "9am-10am", activity = "Lab", course = "Sociology", duration = "1h"),
Activity(date = "14 Oct", time = "10am-11am", activity = "Lecture", course = "Environmental Science", duration = "1h"),
Activity(date = "14 Oct", time = "11am-12pm", activity = "Lecture", course = "Statistics", duration = "1h"),
Activity(date = "14 Oct", time = "1pm-2pm", activity = "Tutorial", course = "Calculus", duration = "1h"),
Activity(date = "15 Oct", time = "9am-10am", activity = "Lecture", course = "Linear Algebra", duration = "1h")
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