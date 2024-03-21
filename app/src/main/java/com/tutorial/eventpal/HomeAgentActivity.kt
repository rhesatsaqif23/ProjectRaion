package com.tutorial.eventpal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.tutorial.firebaseapp.R

class HomeAgentActivity: AppCompatActivity() {
    lateinit var searchButton: ImageButton
    lateinit var partyButton: ImageButton
    lateinit var concertButton: ImageButton
    lateinit var meetingButton: ImageButton
    lateinit var workshopButton: ImageButton
    lateinit var campusButton: ImageButton
    lateinit var sportButton: ImageButton
    lateinit var weddingButton: ImageButton
    lateinit var otherButton: ImageButton
    lateinit var homeNavBarButton: ImageButton
    lateinit var cartNavBarButton: ImageButton
    lateinit var agentNavBarButton: ImageButton
    lateinit var accountNavBarButton: ImageButton
    lateinit var seemorebutton1: ImageButton

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

        homeNavBarButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
//
//        cartNavBarButton.setOnClickListener {
//            val intent = Intent(this, CartNavBarActivity::class.java)
//            startActivity(intent)
//        }

//        agentNavBarButton.setOnClickListener {
//            val intent = Intent(this, HomeAgentActivity::class.java)
//            startActivity(intent)
//        }

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