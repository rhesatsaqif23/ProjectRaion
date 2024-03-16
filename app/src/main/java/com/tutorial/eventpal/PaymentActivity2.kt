package com.tutorial.eventpal

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class PaymentActivity2 : AppCompatActivity() {
    private lateinit var btnCard: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment2)

        btnCard = findViewById(R.id.btn_card)
        btnCard.setOnClickListener {
            val intent = Intent(this, PaymentActivity1::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
            startActivity(intent, options.toBundle())
        }
    }
}