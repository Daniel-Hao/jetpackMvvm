package com.example.jetpackmvvm.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

     val _data = MediatorLiveData<String>()


    val myData: MediatorLiveData<String> get() = _data

    fun setCC(): String {


        _data.value = "456"


        return _data.value!!
    }

}