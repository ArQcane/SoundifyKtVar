package com.example.soundifyktvar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.soundifyktvar.R
import com.example.soundifyktvar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    lateinit var viewModel: SongsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        val viewModelProviderFactory = SongViewModelFactory(songsRepository)
//        viewModel= ViewModelProvider(this, viewModelProviderFactory).get(SongsViewModel::class.java)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.songsNavHostFragment) as NavHostFragment
        val navController = navHostFragment.findNavController()

        binding.bottomNavigationView.setupWithNavController(navController)
    }
}
