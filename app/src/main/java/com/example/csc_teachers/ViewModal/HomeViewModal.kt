package com.example.csc_teachers.ViewModal

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import com.example.csc_teachers.modal.FormState
import kotlinx.coroutines.flow.MutableStateFlow

class HomeViewModal : ViewModel() {

    private var _formState = MutableStateFlow<FormState>(FormState())

    val formState = _formState

//    fun updateFormState(state : FormState) {
//        _formState.value = state
//    }

    fun updateDate(date: String) {
        _formState.value.date = date
    }

    fun updateActivity(activity: String) {
        _formState.value.activity = activity

    }
    fun updateDepartment(department: String) {
        _formState.value.department = department

    }
    fun updateSection(section: String) {
        _formState.value.section = section
    }
    fun updateFrom(from: String) {
        _formState.value.from = from

    }
    fun updateTo(to: String) {
        _formState.value.to = to

    }
    fun updateDuration(duration: String) {
        _formState.value.duration = duration
    }

    fun updateSubject(subject: String) {
        _formState.value.subject = subject

    }





}