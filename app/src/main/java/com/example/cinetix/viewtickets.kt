package com.example.cinetix

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class viewtickets : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_viewtickets)

        val review: Button = findViewById(R.id.review)

        review.setOnClickListener{
            val intent = Intent(this,reviews::class.java)
            startActivity(intent)
        }

        val viewticket: Button = findViewById(R.id.vtik)

        viewticket.setOnClickListener{
            val intent = Intent(this,Ticket::class.java)
            startActivity(intent)
        }

        val cancelb: Button = findViewById(R.id.cancelb)

        cancelb.setOnClickListener{
            val intent = Intent(this,cancelTicket::class.java)
            startActivity(intent)
        }

        val mov:ImageView = findViewById(R.id.movieIcon)

        mov.setOnClickListener{
            val intent = Intent(this,MoviesShow::class.java)
            startActivity(intent)
        }


        val homes:ImageView = findViewById(R.id.homeIcon)

        homes.setOnClickListener{
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        val prof:ImageView = findViewById(R.id.profileIcon)

        prof.setOnClickListener{
            val intent = Intent(this,myprofile::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}