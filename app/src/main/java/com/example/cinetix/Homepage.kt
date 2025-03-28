package com.example.cinetix

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Homepage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

//        val moviesall:TextView = findViewById(R.id.movieIcon)
//
//        moviesall.setOnClickListener{
//            val intent = Intent(this,MoviesShow::class.java)
//            startActivity(intent)
//        }


        val ticket:ImageView = findViewById(R.id.ticketIcon)

        ticket.setOnClickListener{
            val intent = Intent(this,viewtickets::class.java)
            startActivity(intent)
        }

        val movies:ImageView = findViewById(R.id.movieIcon)

        movies.setOnClickListener{
            val intent = Intent(this,MoviesShow::class.java)
            startActivity(intent)
        }


        val profilev:ImageView = findViewById(R.id.profileIcon)

        profilev.setOnClickListener{
            val intent = Intent(this,myprofile::class.java)
            startActivity(intent)
        }

        val moviePosterIds = listOf(R.id.moviePoster1, R.id.moviePoster2, R.id.moviePoster10)

        for (id in moviePosterIds) {
            findViewById<ImageView>(id).setOnClickListener {
                navigateToMoviesShow()
            }
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToMoviesShow() {
        val intent = Intent(this, MoviesShow::class.java)
        startActivity(intent)
    }
}