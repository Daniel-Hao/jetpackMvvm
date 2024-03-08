package com.example.jetpackmvvm.navg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jetpackmvvm.MMMActivity
import com.example.jetpackmvvm.databinding.FragmentBlank22Binding

class Blank22Fragment : Fragment(){


    private lateinit var binding : FragmentBlank22Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank22Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvClose.setOnClickListener(View.OnClickListener {



        })

        binding.tvGo.setOnClickListener(View.OnClickListener {

            MMMActivity.startMMMActivity(context,1,"123")

            context?.let { it1 -> MMMActivity.startMMMActivity(it1,1,"123") }

        })






    }
}
