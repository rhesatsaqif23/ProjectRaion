package com.tutorial.eventpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class ChooseRoleActivity : AppCompatActivity() {
    lateinit var btnUser: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_role)

        btnUser = findViewById(R.id.btn_user)
        btnUser.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}