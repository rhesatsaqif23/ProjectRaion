package com.tutorial.eventpal

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class AgentDetailActivity2 : AppCompatActivity() {
    lateinit var btnAbout: AppCompatButton
    lateinit var btnReview: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent_detail2)

        btnAbout = findViewById(R.id.btn_about)
        btnAbout.setOnClickListener {
            val intent = Intent(this, AgentDetailActivity::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
            startActivity(intent, options.toBundle())
        }

        btnReview = findViewById(R.id.btn_review)
        btnReview.setOnClickListener {
            val intent = Intent(this, AgentDetailActivity3::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
            startActivity(intent, options.toBundle())
        }
    }
}