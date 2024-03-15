package com.tutorial.eventpal

import UserChatActivity
import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class AgentDetailActivity : AppCompatActivity() {
    lateinit var btnSpeciality: AppCompatButton
    lateinit var btnReview: AppCompatButton
    lateinit var btnChat: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent_detail)

        btnSpeciality = findViewById(R.id.btn_speciality)
        btnSpeciality.setOnClickListener {
            val intent = Intent(this, AgentDetailActivity2::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
            startActivity(intent, options.toBundle())
        }

        btnReview = findViewById(R.id.btn_review)
        btnReview.setOnClickListener {
            val intent = Intent(this, AgentDetailActivity3::class.java)
            val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
            startActivity(intent, options.toBundle())
        }

        btnChat = findViewById(R.id.btn_chat)
        btnChat.setOnClickListener {
            val intent = Intent(this, UserChatActivity::class.java)
            startActivity(intent)
        }
    }
}