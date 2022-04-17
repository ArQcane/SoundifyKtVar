package com.example.soundifyktvar.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.soundifyktvar.model.Song
import kotlinx.coroutines.flow.Flow
import retrofit2.http.DELETE


@Dao
interface SongDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(song: Song): Long //returns the id that was inserted

    @Query("SELECT * FROM Song")
    fun getAllSongs(): LiveData<List<Song>>

    @Delete
    suspend fun deleteSongs(song: Song)

    @Update
    suspend fun update(song: Song)

}