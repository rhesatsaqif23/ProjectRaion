package com.tutorial.eventpal

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class PaymentActivity1 : AppCompatActivity() {
    private lateinit var btnWallet: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment1)

        btnWallet = findViewById(R.id.btn_wallet)
        btnWallet.setOnClickListener {
            val intent = Intent(this, PaymentActivity2::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
            startActivity(intent, options.toBundle())
        }
    }
}