package com.tutorial.eventpal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class HomeAgentActivity: AppCompatActivity() {
    lateinit var searchButton: AppCompatButton
    lateinit var partyButton: AppCompatButton
    lateinit var concertButton: AppCompatButton
    lateinit var meetingButton: AppCompatButton
    lateinit var workshopButton: AppCompatButton
    lateinit var campusButton: AppCompatButton
    lateinit var sportButton: AppCompatButton
    lateinit var weddingButton: AppCompatButton
    lateinit var otherButton: AppCompatButton
    lateinit var homeNavBarButton: AppCompatButton
    lateinit var cartNavBarButton: AppCompatButton
    lateinit var agentNavBarButton: AppCompatButton
    lateinit var accountNavBarButton: AppCompatButton
    lateinit var seemorebutton1: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_agent)

        searchButton = findViewById(R.id.searchviewbuttondummy)
        partyButton = findViewById(R.id.partyButton)
        concertButton = findViewById(R.id.concertButton)
        meetingButton = findViewById(R.id.meetingButton)
        workshopButton = findViewById(R.id.workshopButton)
        campusButton = findViewById(R.id.campusButton)
        sportButton = findViewById(R.id.sportButton)
        weddingButton = findViewById(R.id.weddingButton)
        otherButton = findViewById(R.id.otherButton)
        homeNavBarButton = findViewById(R.id.homenavbarbtn)
        cartNavBarButton = findViewById(R.id.cartnavbarbtn)
        agentNavBarButton = findViewById(R.id.agentnavbarbtn)
        accountNavBarButton = findViewById(R.id.accountnavbarbtn)
        seemorebutton1 = findViewById(R.id.seemorebutton1)

        searchButton.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

//        partyButton.setOnClickListener {
//            val intent = Intent(this, PartyActivity::class.java)
//            startActivity(intent)
//        }

        // Implementasi untuk tombol lainnya seperti di atas
        // ...

//        homeNavBarButton.setOnClickListener {
//            val intent = Intent(this, HomeNavBarActivity::class.java)
//            startActivity(intent)
//        }
//
//        cartNavBarButton.setOnClickListener {
//            val intent = Intent(this, CartNavBarActivity::class.java)
//            startActivity(intent)
//        }

        agentNavBarButton.setOnClickListener {
            val intent = Intent(this, HomeAgentActivity::class.java)
            startActivity(intent)
        }

        seemorebutton1.setOnClickListener {
            val intent = Intent(this, AgentDetailActivity::class.java)
            startActivity(intent)
        }

//        accountNavBarButton.setOnClickListener {
//            val intent = Intent(this, AccountNavBarActivity::class.java)
//            startActivity(intent)
//        }
    }
}