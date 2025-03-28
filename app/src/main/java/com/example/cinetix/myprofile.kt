package com.example.cinetix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class myprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_myprofile)

        val mov:ImageView = findViewById(R.id.movieIcon)

        mov.setOnClickListener{
            val intent = Intent(this,MoviesShow::class.java)
            startActivity(intent)
        }

        val changePassword:ImageView = findViewById(R.id.imageViewArrow3)

        changePassword.setOnClickListener{
            val intent = Intent(this,change_password::class.java)
            startActivity(intent)
        }

        val privacy:ImageView = findViewById(R.id.imageViewArrow4)

        privacy.setOnClickListener{
            val intent = Intent(this,privacy_policy::class.java)
            startActivity(intent)
        }


        val tik:ImageView = findViewById(R.id.ticketIcon)

        tik.setOnClickListener{
            val intent = Intent(this,viewtickets::class.java)
            startActivity(intent)
        }


        val homes:ImageView = findViewById(R.id.homeIcon)

        homes.setOnClickListener{
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }

        val editp:ImageView = findViewById(R.id.imageViewArrow1)

        editp.setOnClickListener{
            val intent = Intent(this,editprofile::class.java)
            startActivity(intent)
        }


        val logout: Button = findViewById(R.id.buttonLogout)

        logout.setOnClickListener{
            val intent = Intent(this,Mainpage::class.java)
            startActivity(intent)
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}