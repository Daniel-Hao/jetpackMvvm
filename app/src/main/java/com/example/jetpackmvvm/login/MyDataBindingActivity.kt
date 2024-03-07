package com.example.jetpackmvvm.login

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.jetpackmvvm.R
import com.example.jetpackmvvm.base.LoginViewModel
import com.example.jetpackmvvm.base.MyLifeObserver
import com.example.jetpackmvvm.bean.EmailBean
import com.example.jetpackmvvm.bean.UserBean
import com.example.jetpackmvvm.databinding.ActivitySignBinding
import com.example.jetpackmvvm.login.handler.MyHandler

class MyDataBindingActivity : AppCompatActivity() {

    lateinit var _dataBinding: ActivitySignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sign)

        _dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign)


        var userBean = UserBean()
        userBean.userName.set("Daniel")

        _dataBinding.userInfo = userBean

        userBean.userId.set("userId")
        userBean.userName.set("Daniel22")

        //_dataBinding.userInfo.userName = "Daniel22" //报错

        var email = EmailBean("11", 321)


        _dataBinding.handler = MyHandler(userBean)


        lifecycle.addObserver(MyLifeObserver())


         val viewModel : LoginViewModel by viewModels()

        viewModel.myData.observe(this,{newData ->

        })

    }
}