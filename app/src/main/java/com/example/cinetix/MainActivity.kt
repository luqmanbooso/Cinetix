package com.example.cinetix

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnboardSc1::class.java)
            startActivity(intent)
            finish()
        }, 4000)

        //delay text
        val textView = findViewById<TextView>(R.id.Logotext)
        textView.alpha = 0f

        Handler(Looper.getMainLooper()).postDelayed({
            textView.animate().alpha(1f).setDuration(500)
        }, 2000)

        val progressBar = findViewById<ProgressBar>(R.id.launchload)

        progressBar.visibility = View.VISIBLE

        progressBar.postDelayed({
            progressBar.visibility = View.GONE
        }, 2500)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}