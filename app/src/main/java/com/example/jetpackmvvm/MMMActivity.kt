package com.example.jetpackmvvm

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MMMActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val num = intent.getIntExtra(EXTRA_NUM, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
    }

    companion object {
        private const val EXTRA_NUM = "extra_num"
        private const val EXTRA_NAME = "extra_name"
        fun startMMMActivity(context: Context?, num: Int, name: String?) {
            val intent = Intent(context, MMMActivity::class.java)
            intent.putExtra(EXTRA_NUM, num)
            intent.putExtra(EXTRA_NAME, name)
            context?.startActivity(intent)
        }
    }
}
