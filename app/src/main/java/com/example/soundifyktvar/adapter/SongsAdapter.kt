package com.example.soundifyktvar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.soundifyktvar.R
import com.example.soundifyktvar.databinding.SingleViewRecyclerviewGridBinding
import com.example.soundifyktvar.model.Song

class SongsAdapter : RecyclerView.Adapter<SongsAdapter.SongViewHolder>() {
    inner class SongViewHolder(val binding: SingleViewRecyclerviewGridBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback =  object : DiffUtil.ItemCallback<Song>(){
        override fun areItemsTheSame(oldItem: Song, newItem: Song): Boolean {
            return oldItem.fileLink == newItem.fileLink
        }

        override fun areContentsTheSame(oldItem: Song, newItem: Song): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
            val binding = SingleViewRecyclerviewGridBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return SongViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val currentSong = differ.currentList[position]
        holder.binding.apply {
            tvArtistName.text = currentSong.artiste
            tvTitle.text = currentSong.title
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}