package com.example.jetpackmvvm.test

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackmvvm.R

class TestActivity : AppCompatActivity(), View.OnClickListener {
    var tv11: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tv11 = findViewById(R.id.tv_11)
        tv11.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.tv_11) {
        }
    }
}
