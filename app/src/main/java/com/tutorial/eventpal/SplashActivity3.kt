package com.tutorial.eventpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class SplashActivity3 : AppCompatActivity() {
    lateinit var btnContinue: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash3)

        btnContinue = findViewById(R.id.btn_continue2)
        btnContinue.setOnClickListener {
            startActivity(Intent(this, SplashActivity4::class.java))
        }
    }
}