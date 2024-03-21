package com.tutorial.eventpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.tutorial.firebaseapp.R

class HomeActivity : AppCompatActivity() {
    lateinit var btnProjector: ImageButton
    lateinit var btnAgent: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnProjector = findViewById(R.id.projector_button)
        btnProjector.setOnClickListener {
            val intent = Intent(this, SearchAllActivity::class.java)
            startActivity(intent)
        }

        btnAgent = findViewById(R.id.agentnavbarbtn)
        btnAgent.setOnClickListener() {
            startActivity(Intent(this, HomeAgentActivity::class.java))
            finish()
        }
    }
}