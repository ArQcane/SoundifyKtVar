package com.example.soundifyktvar.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.soundifyktvar.R
import com.example.soundifyktvar.databinding.FragmentSearchBinding
import com.example.soundifyktvar.ui.MainActivity
import com.example.soundifyktvar.ui.SongsViewModel

class search : Fragment(R.layout.fragment_search) {

    private lateinit var binding: FragmentSearchBinding
    lateinit var viewModel: SongsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = (activity as MainActivity).viewModel
    }

}