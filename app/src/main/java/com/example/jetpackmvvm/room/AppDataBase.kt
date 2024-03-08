package com.example.jetpackmvvm.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserDBInfo::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun userDBDao(): UserDBDao

    companion object {
        @Volatile
        private var INSTANCE: AppDataBase?= null
        fun getInstance(context: Context): AppDataBase =
            INSTANCE?: synchronized(this){
                INSTANCE?:buildDatabase(context).also {
                    INSTANCE = it
                }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, AppDataBase::class.java, "hdlapp.db")
                .allowMainThreadQueries()
                .build()
    }

}
