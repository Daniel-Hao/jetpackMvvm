package com.example.jetpackmvvm.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity(){

    private lateinit var _viewBinding: T

    protected val myViewBinding get() = _viewBinding


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        _viewBinding = getViewBinding()
        setContentView(_viewBinding.root)


    }


   protected abstract fun getViewBinding() : T


}
