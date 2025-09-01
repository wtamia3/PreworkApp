package com.example.preworkapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // XML layout

        val greetingText: TextView = findViewById(R.id.greetingText)
        val myImage: ImageView = findViewById(R.id.myImage)
        val myGif: ImageView = findViewById(R.id.myGif)
        val myButton: Button = findViewById(R.id.myButton)

        greetingText.text = "Hello World!"

        // Load static image
        Glide.with(this)
            .load(R.drawable.chatgpt_image) // your PNG image in drawable folder
            .into(myImage)

        // Load GIF
        Glide.with(this)
            .asGif()
            .load(R.drawable.despicable_me) // your GIF in drawable folder
            .into(myGif)

        myButton.setOnClickListener {
            greetingText.text = "Button clicked!"
        }
    }
}

