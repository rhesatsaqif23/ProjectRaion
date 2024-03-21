package com.tutorial.eventpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class LapakActivity1 : AppCompatActivity() {
    lateinit var btnRent: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapak1)

        btnRent = findViewById(R.id.btn_rent)
        btnRent.setOnClickListener() {
            startActivity(Intent(this, LapakConfirmationActivity::class.java))
            finish()
        }
    }
}