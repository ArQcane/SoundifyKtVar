package com.example.soundifyktvar.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Song(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "title")
    val title : String,
    @ColumnInfo(name = "artiste")
    val artiste: String,
    @ColumnInfo(name = "fileLink")
    val fileLink: String,
    @ColumnInfo(name = "songLength")
    val songLength: Double,
    @ColumnInfo(name = "drawable")
    val drawable: String
)