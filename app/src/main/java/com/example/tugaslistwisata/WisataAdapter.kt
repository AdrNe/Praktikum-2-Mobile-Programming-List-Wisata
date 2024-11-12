package com.example.tugaslistwisata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter(
    private val wisataList: List<Wisata>,
    private val onItemClick: (Wisata) -> Unit
) : RecyclerView.Adapter<WisataAdapter.WisataViewHolder>() {

    inner class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageWisata)
        private val titleView: TextView = itemView.findViewById(R.id.titleWisata)

        fun bind(wisata: Wisata) {
            imageView.setImageResource(wisata.imageResId)
            titleView.text = wisata.title

            itemView.setOnClickListener {
                onItemClick(wisata)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        holder.bind(wisataList[position])
    }

    override fun getItemCount() = wisataList.size
}

