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

class Comingsoon : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_comingsoon)

        val prof: ImageView = findViewById(R.id.profileIcon)

        prof.setOnClickListener{
            val intent = Intent(this,myprofile::class.java)
            startActivity(intent)
        }

        val homes: ImageView = findViewById(R.id.homeIcon)

        homes.setOnClickListener{
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        val ticket: ImageView = findViewById(R.id.ticketIcon)

        ticket.setOnClickListener{
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        val ns: Button = findViewById(R.id.nowShowingBtn)

        ns.setOnClickListener{
            val intent = Intent(this,MoviesShow::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}