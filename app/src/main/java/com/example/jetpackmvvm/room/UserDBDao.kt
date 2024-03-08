package com.example.jetpackmvvm.room

import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDBDao {
    @get:Query("SELECT * FROM userdb")
    val all: List<UserDBInfo>

    @Query("SELECT * FROM userdb WHERE uId IN (:userIds)")
    fun loadAllByIds(userIds: IntArray?): List<UserDBInfo>
}
