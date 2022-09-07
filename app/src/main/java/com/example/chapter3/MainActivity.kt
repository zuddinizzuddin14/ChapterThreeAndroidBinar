package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMainIntent = findViewById<Button>(R.id.btnMainIntent)
        val btnMainImplicitIntent = findViewById<Button>(R.id.btnMainImplicitIntent)
        val btnMainPassing = findViewById<Button>(R.id.btnMainPassing)
        val btnMainFragment = findViewById<Button>(R.id.btnMainFragment)
        val btnMainRecycleView = findViewById<Button>(R.id.btnMainRecycleView)

        btnMainIntent.setOnClickListener {
            Intent(this, IntentSatu::class.java).also {
                startActivity(it)
            }
        }

        btnMainImplicitIntent.setOnClickListener {
            Intent(this, ImplicitIntent::class.java).also {
                startActivity(it)
            }
        }

        btnMainPassing.setOnClickListener {
            Intent(this, PassingDataSatu::class.java).also {
                startActivity(it)
            }
        }

        btnMainFragment.setOnClickListener {
            Intent(this, Fragment::class.java).also {
                startActivity(it)
            }
        }

        btnMainRecycleView.setOnClickListener {
            Intent(this, RecyclerView::class.java).also {
                startActivity(it)
            }
        }
    }
}

