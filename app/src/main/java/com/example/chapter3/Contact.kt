package com.example.chapter3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val fotoProfil: Int,
    val nama: String,
    val noHp: String,
    val deskripsi: String
    ) : Parcelable