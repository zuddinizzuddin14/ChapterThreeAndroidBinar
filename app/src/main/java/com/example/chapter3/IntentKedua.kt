package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.chapter3.R

class IntentKedua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_kedua)

        val btnIntentBack = findViewById<Button>(R.id.btnIntent2Back)

        btnIntentBack.setOnClickListener {
            finish()
        }
    }
}