package com.tutorial.eventpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.tutorial.firebaseapp.R

class SplashActivity : AppCompatActivity() {
//    timer splash screen
    private val splashTimeout: Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        menjalankan main activity
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, splashTimeout)


    }
}