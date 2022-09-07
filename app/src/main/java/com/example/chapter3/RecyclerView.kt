package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val contactList = listOf(
            Contact(
                R.drawable.foto1,
                "Karma Sirait",
                "+62-815-555-056",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto2,
                "Intan Safitri",
                "+62-878-555-215",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto3,
                "Belinda Nasyiah",
                "+62-812-555-956",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto4,
                "Zulaikha Yuliarti",
                "+62-878-555-557",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto5,
                "Dian Purwanti",
                "+62-838-555-344",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto6,
                "Ani Laksita",
                "+62-878-555-501",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto7,
                "Reza Rajata",
                "+62-838-555-169",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto8,
                "Hilda Padmasari",
                "+62-838-555-671",
                "Lorem Ipsum Dolor Sit"
            ),
            Contact(
                R.drawable.foto9,
                "Ikin Narpati",
                "+62-859-555-971",
                "Lorem Ipsum Dolor Sit"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ContactAdapter(this, contactList) {
        }
    }
}
