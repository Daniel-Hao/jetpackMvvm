package com.example.jetpackmvvm.login

import android.os.Bundle
import android.os.PersistableBundle
import com.example.jetpackmvvm.base.BaseActivity
import com.example.jetpackmvvm.databinding.ActivitySignBinding

class SignActivity : BaseActivity<ActivitySignBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding.tv11.text = "11"
    }
    /*override fun getViewBinding(): ActivitySignBinding {
        TODO("Not yet implemented")
        ActivitySignBinding.inflate(layoutInflater)
    }*/

    override fun getViewBinding() =ActivitySignBinding.inflate(layoutInflater)
}