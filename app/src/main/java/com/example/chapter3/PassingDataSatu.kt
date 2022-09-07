package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PassingDataSatu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_data_satu)

        val btnSubmit = findViewById<Button>(R.id.btnPass1Submit)
        val edNama = findViewById<EditText>(R.id.edPass1Nama)
        val edUsia = findViewById<EditText>(R.id.edPass1Usia)
        val edKota = findViewById<EditText>(R.id.edPass1Kota)

        btnSubmit.setOnClickListener {
            val nama = edNama.text.toString()
            val usia = edUsia.text.toString().toInt()
            val kota = edKota.text.toString()

            Intent(this, PassingDataDua::class.java).also {
                it.putExtra("EXTRA_NAMA", nama)
                it.putExtra("EXTRA_USIA", usia)
                it.putExtra("EXTRA_KOTA", kota)
                startActivity(it)
            }
        }


    }
}