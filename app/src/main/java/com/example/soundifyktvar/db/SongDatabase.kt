package com.example.soundifyktvar.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.soundifyktvar.model.Song

@Database(entities = [Song::class], version = 1, exportSchema = true)
abstract class SongDatabase : RoomDatabase() {

    abstract fun songDao(): SongDao

    companion object {
        @Volatile
        private var INSTANCE: SongDatabase? = null
        fun getDatabase(context: Context): SongDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SongDatabase::class.java,
                    "song_database"
                )
                    .createFromAsset("database/song.db")
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}