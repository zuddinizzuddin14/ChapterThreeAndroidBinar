package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PassingDataDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_data_dua)

        val tvHasil1 = findViewById<TextView>(R.id.tvPass2Hasil1)
        val tvHasil2 = findViewById<TextView>(R.id.tvPass2Hasil2)
        val tvHasil3 = findViewById<TextView>(R.id.tvPass2Hasil3)

        val name = intent.getStringExtra("EXTRA_NAMA")
        val usia = intent.getIntExtra("EXTRA_USIA", 0)
        val kota = intent.getStringExtra("EXTRA_KOTA")

        tvHasil1.text = "Nama anda adalah $name"
        tvHasil2.text = "Usia anda $usia"
        tvHasil3.text = "Alamat anda $kota"

    }
}