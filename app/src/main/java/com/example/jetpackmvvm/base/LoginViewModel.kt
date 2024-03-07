package com.example.jetpackmvvm.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _data = MediatorLiveData<String>()

    val  myData : LiveData<String> get() = _data

}