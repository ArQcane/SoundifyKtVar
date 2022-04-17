package com.example.soundifyktvar.ui


import android.app.Application
import android.view.View
import androidx.lifecycle.*
import com.example.soundifyktvar.application.SongApplication
import com.example.soundifyktvar.db.SongDao
import com.example.soundifyktvar.db.SongDatabase
import com.example.soundifyktvar.model.Song
import com.example.soundifyktvar.repository.SongRepository
import kotlinx.coroutines.launch

class SongsViewModel(
    songDao: SongDao
) : ViewModel(){

}

class SongViewModelFactory(private val songDao: SongDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SongsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SongsViewModel(songDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}