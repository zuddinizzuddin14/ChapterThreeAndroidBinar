package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentSatu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_satu)

        val btnIntentClick = findViewById<Button>(R.id.btnIntent1Click)

        btnIntentClick.setOnClickListener {
            Intent(this, IntentKedua::class.java).also {
                startActivity(it)
            }
        }
    }
}