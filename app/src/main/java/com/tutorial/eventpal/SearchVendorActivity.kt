package com.tutorial.eventpal

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorial.firebaseapp.R

class SearchVendorActivity : AppCompatActivity() {
    lateinit var btnAll: AppCompatButton
    lateinit var btnArrow: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnAll = findViewById(R.id.btn_all)
        btnAll.setOnClickListener() {
            startActivity(Intent(this, SearchVendorActivity::class.java))
            finish()
        }

        btnArrow = findViewById(R.id.arrow_detail)
        btnArrow.setOnClickListener() {
            startActivity(Intent(this, VendorDetailActivity::class.java))
            finish()
        }
    }
}