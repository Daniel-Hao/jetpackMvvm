package com.example.jetpackmvvm

import android.app.Application
import androidx.room.Room
import com.example.jetpackmvvm.room.AppDataBase

class MyAPP : Application() {

    override fun onCreate() {
        super.onCreate()


       // var db : AppDataBase  = Room.databaseBuilder(applicationContext,AppDataBase::class.java,"hdlapp.db").build()
    }
}