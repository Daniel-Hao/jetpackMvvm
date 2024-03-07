package com.example.jetpackmvvm.login.handler

import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.jetpackmvvm.R
import com.example.jetpackmvvm.bean.UserBean

class MyHandler(val userBean: UserBean) {

    fun onClick(view: View) {

        Log.e("hdl", "MyHandler onClick")

        if (view.id == R.id.tv_11) {
            Log.e("hdl", "tv_11")
            userBean.userName.set("我变了11")
            userBean.userId.set("我变了11")
        } else if (view.id == R.id.tv_22) {
            userBean.userId.set("我变了22")
            userBean.userName.set("我变了22")
        }
    }
}