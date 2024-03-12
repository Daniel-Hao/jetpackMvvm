package com.example.jetpackmvvm.test

import android.animation.AnimatorInflater
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.example.jetpackmvvm.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.InputStreamReader

class TestActivity : AppCompatActivity(), View.OnClickListener {
    //private lateinit var tv11: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        //tv11 = findViewById(R.id.tv_11)
        //tv11.setOnClickListener(this)


        val  job1 = mScope.launch {
            delay(1000)
        }

        val  job2 = mScope.launch(Dispatchers.IO){

            async {  }

            withContext(Dispatchers.Main){

            }
        }

        val jsonFile = assets.open("animation.json")
        val json = InputStreamReader(jsonFile).readText()
        Log.e("hdl","json=${json}")

        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.la_view)
        lottieAnimationView.setAnimation("animation.json")
        lottieAnimationView.playAnimation()
        //animationStart(this)

        lottieAnimationView.setOnClickListener(View.OnClickListener {
            lottieAnimationView.playAnimation()
        })
    }

    override fun onClick(v: View) {
        /*if (v.id == R.id.tv_11) {

        }*/
    }

    private fun animationStart(context :Context) {
        val jsonFile = assets.open("animation.json")
        val json = InputStreamReader(jsonFile).readText()

        //val animation = AnimatorInflater.loadAnimator(context, R.animator.animation)
       // animation.setTarget(view)
        //animation.start()

    }


    private val mScope = MainScope()


}
