package com.example.soundifyktvar.ui.fragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soundifyktvar.R
import com.example.soundifyktvar.adapter.SongsAdapter
import com.example.soundifyktvar.application.SongApplication
import com.example.soundifyktvar.databinding.FragmentHomepageBinding
import com.example.soundifyktvar.model.Song
import com.example.soundifyktvar.ui.MainActivity
import com.example.soundifyktvar.ui.SongViewModelFactory
import com.example.soundifyktvar.ui.SongsViewModel


class homepage : Fragment(R.layout.fragment_homepage) {

    private lateinit var binding: FragmentHomepageBinding
    private val viewModel: SongsViewModel by activityViewModels {
        SongViewModelFactory(
            (activity?.application as SongApplication).database
                .songDao()
        )
    }
    lateinit var song: Song


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomepageBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = (activity as MainActivity).viewModel

        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        var songsAdapter = SongsAdapter()
        binding.rvHomePageSongs.apply{
            adapter = songsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}