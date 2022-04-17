package com.example.soundifyktvar.repository

import androidx.lifecycle.LiveData
import com.example.soundifyktvar.db.SongDao
import com.example.soundifyktvar.model.Song

class SongRepository(private val songDao: SongDao) {

    val getAllSongs: LiveData<List<Song>> = songDao.getAllSongs()

}