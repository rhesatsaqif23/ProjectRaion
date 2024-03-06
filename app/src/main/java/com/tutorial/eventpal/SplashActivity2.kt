package com.tutorial.eventpal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

@SuppressLint("CustomSplashScreen")
class SplashActivity2 : AppCompatActivity() {
    lateinit var btnContinue: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        btnContinue = findViewById(R.id.btn_continue1)
        btnContinue.setOnClickListener {
            startActivity(Intent(this, SplashActivity3::class.java))
        }
    }
}