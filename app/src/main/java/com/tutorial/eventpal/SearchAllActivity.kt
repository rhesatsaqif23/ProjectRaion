package com.tutorial.eventpal

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorial.firebaseapp.R

class SearchAllActivity : AppCompatActivity() {
    lateinit var btnVendor: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_all)

        btnVendor = findViewById(R.id.btn_nav_vendor)
        btnVendor.setOnClickListener() {
            startActivity(Intent(this, SearchVendorActivity::class.java))
            finish()
        }
    }
}