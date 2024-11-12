package com.example.tugaslistwisata

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Mendapatkan data yang dikirim dari MainActivity
        val title = intent.getStringExtra("title") ?: "No Title"
        val description = intent.getStringExtra("description") ?: "No Description"
        val imageResId = intent.getIntExtra("imageResId", 0)

        // Menampilkan data di layout
        findViewById<ImageView>(R.id.imageWisataDetail).setImageResource(imageResId)
        findViewById<TextView>(R.id.titleWisataDetail).text = title
        findViewById<TextView>(R.id.descriptionWisataDetail).text = description
    }
}


