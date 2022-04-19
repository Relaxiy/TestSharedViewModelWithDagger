package com.example.testsharedviewmodel.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class TestedViewModel @Inject constructor() : ViewModel() {

    val message: LiveData<String> get() = _message
    private val _message = MutableLiveData<String>()

    fun sendMessage(text: String) {
        _message.value = text
    }
}