package com.example.soundifyktvar.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.soundifyktvar.R
import com.example.soundifyktvar.databinding.FragmentPlaySongBinding
import com.example.soundifyktvar.ui.MainActivity
import com.example.soundifyktvar.ui.SongsViewModel

class playSongFragment : Fragment(R.layout.fragment_play_song) {

    private lateinit var binding: FragmentPlaySongBinding
    lateinit var viewModel: SongsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = (activity as MainActivity).viewModel
    }

}