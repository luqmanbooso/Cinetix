package com.example.cinetix

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoviesShow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movies_show)

        findViewById<Button>(R.id.bookNowButton1).setOnClickListener {

            val intent = Intent(this, BookDate::class.java)
            startActivity(intent)
        }

        val prof:ImageView = findViewById(R.id.profileIcon)

        prof.setOnClickListener{
            val intent = Intent(this,myprofile::class.java)
            startActivity(intent)
        }


        val homes:ImageView = findViewById(R.id.homeIcon)

        homes.setOnClickListener{
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        val ticket:ImageView = findViewById(R.id.ticketIcon)

        ticket.setOnClickListener{
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        val comsoon:Button = findViewById(R.id.comingSoonButton)

        comsoon.setOnClickListener{
            val intent = Intent(this,Comingsoon::class.java)
            startActivity(intent)
        }

        val info:Button = findViewById(R.id.infoButton1)

        info.setOnClickListener{
            val intent = Intent(this,MovieDetails::class.java)
            startActivity(intent)
        }


        val spinner = findViewById<Spinner>(R.id.sortingSpinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.sorting_options,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                (view as TextView).setTextColor(Color.WHITE)
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}