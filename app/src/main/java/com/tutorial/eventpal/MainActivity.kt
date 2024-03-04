package com.tutorial.eventpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.tutorial.firebaseapp.R

class MainActivity : AppCompatActivity() {
    lateinit var textUsername: TextView
    lateinit var textEmail:TextView
    lateinit var btnLogout: Button

    val firebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textUsername = findViewById(R.id.username)
        textEmail = findViewById(R.id.email)
        btnLogout = findViewById(R.id.btn_logout)

        val firebaseUser = firebaseAuth.currentUser
        if (firebaseUser != null) {
            textUsername.text = firebaseUser.displayName
            textEmail.text = firebaseUser.email
        } else {
            startActivity(Intent(this, SplashActivity2::class.java))
            finish()
        }
        btnLogout.setOnClickListener() {
            firebaseAuth.signOut()
            startActivity(Intent(this, SplashActivity2::class.java))
            finish()
        }
    }
}