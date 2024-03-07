package com.example.jetpackmvvm.login

import android.os.Bundle
import android.os.PersistableBundle
import com.example.jetpackmvvm.base.BaseActivity
import com.example.jetpackmvvm.bean.UserBean
import com.example.jetpackmvvm.databinding.ActivitySignBinding

class SignActivity : BaseActivity<ActivitySignBinding>() {

    lateinit var userBean: UserBean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        userBean = UserBean()
        userBean.userName.set("Daniel")
        userBean.userId.set("123")



        myViewBinding.tv11.text = "11"
    }/*override fun getViewBinding(): ActivitySignBinding {
        TODO("Not yet implemented")
        ActivitySignBinding.inflate(layoutInflater)
    }*/

    override fun getViewBinding() = ActivitySignBinding.inflate(layoutInflater)
}