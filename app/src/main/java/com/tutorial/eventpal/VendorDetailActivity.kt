package com.tutorial.eventpal

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorial.firebaseapp.R

class VendorDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_detail)

        val linearLayout : LinearLayout = findViewById(R.id.btn_mic)

        linearLayout.setOnClickListener {
            val intent = Intent(this@VendorDetailActivity, LapakActivity1::class.java)
            startActivity(intent)
        }

    }
}