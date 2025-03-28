package com.example.cinetix

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        findViewById<Button>(R.id.Signinbb).setOnClickListener {

            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

        val sinup: TextView = findViewById(R.id.ccacc)

        sinup.setOnClickListener{
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

        val fpass: TextView = findViewById(R.id.textViewForgotPassword)

        fpass.setOnClickListener{
            val intent = Intent(this,RecoverPassword::class.java)
            startActivity(intent)
        }

        val sgog: TextView = findViewById(R.id.signInWithGoogle)

        sgog.setOnClickListener{
            val intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}