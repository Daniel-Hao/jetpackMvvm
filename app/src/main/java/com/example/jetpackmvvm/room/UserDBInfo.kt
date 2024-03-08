package com.example.jetpackmvvm.room

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "userdb")
data class UserDBInfo(val sex: Int) {

    @PrimaryKey
    var uId: Int = 0

    @ColumnInfo(name = "u_name")
    var uName: String? = null


}