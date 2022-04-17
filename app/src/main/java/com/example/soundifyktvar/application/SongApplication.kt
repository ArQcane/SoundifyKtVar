package com.example.soundifyktvar.application

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.soundifyktvar.db.SongDatabase
import com.example.soundifyktvar.model.Song
import com.example.soundifyktvar.repository.SongRepository


class SongApplication : Application(){
    val database: SongDatabase by lazy { SongDatabase.getDatabase(this) }
}