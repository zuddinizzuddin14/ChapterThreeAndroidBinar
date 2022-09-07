package com.example.chapter3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        val btnDial = findViewById<Button>(R.id.btnIntentDial)
        val btnUpload = findViewById<Button>(R.id.btnIntentUpload)

        btnDial.setOnClickListener {
            val dialIntent = Intent().apply {
                action = Intent.ACTION_DIAL
            }
            if (dialIntent.resolveActivity(packageManager) != null) {
                startActivity(dialIntent)
            }
        }

        btnUpload.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "iamge/*"
                startActivityForResult(it, 0)
            }
        }

    }
}