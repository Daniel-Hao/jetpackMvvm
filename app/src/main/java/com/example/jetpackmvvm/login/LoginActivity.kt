package com.example.jetpackmvvm.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackmvvm.R
import com.example.jetpackmvvm.databinding.ActivityLoginBinding
import com.example.jetpackmvvm.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    lateinit var viewModel: LoginViewModel

    lateinit var viewBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]


        viewBinding.tv11.text = "我是测试"

        viewBinding.includeTest.tv11.text = "include11"


        viewBinding.includeMerge.tv11.text = "merge11"

        //viewModel.



    }
}