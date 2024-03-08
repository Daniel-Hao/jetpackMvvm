package com.example.jetpackmvvm.navg

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.jetpackmvvm.R
import com.example.jetpackmvvm.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding/*companion object {
        fun newInstance() = BlankFragment()
    }*/

    private lateinit var viewModel: BlankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvGo.setOnClickListener(View.OnClickListener {

            //方法1、使用Directions
            //不传递参数
            //var action = HomeFragmentDirections.actionHomeFragmentToMyOneFragment()
            //findNavController().navigate(action)

            var args = Bundle();
            args.putString("name", "小小")
            args.putInt("age", 12)


            findNavController().navigate(R.id.action_blankFragment_to_blank22Fragment, args)

            //view.findNavController()

            //BlankFragmentArgts

            //Navigation.findNavController(binding.root).navigate(R.id.action_blankFragment_to_blank22Fragment)


            //NavController.navigateUp() 和 NavController.popBackStack() 方法，用于移除（或弹出）堆栈顶部的目的地。

        })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[BlankViewModel::class.java]
        // TODO: Use the ViewModel
    }

}