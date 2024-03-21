package com.tutorial.eventpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.tutorial.firebaseapp.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var textUsername: TextView
    lateinit var btnLogout: ImageButton
    lateinit var btnAgent: ImageButton
    lateinit var mGoogleSignInClient: GoogleSignInClient
    lateinit var mAuth: FirebaseAuth

    val firebaseAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textUsername = findViewById(R.id.username)
        btnLogout = findViewById(R.id.accountnavbarbtn)
        btnAgent = findViewById(R.id.agentnavbarbtn)

        val firebaseUser = firebaseAuth.currentUser
        if (firebaseUser != null) {
            textUsername.text = firebaseUser.displayName
        } else {
            startActivity(Intent(this, SplashActivity2::class.java))
            finish()
        }

        btnLogout.setOnClickListener() {
            firebaseAuth.signOut()
            startActivity(Intent(this, SplashActivity2::class.java))
            finish()
        }

        btnAgent.setOnClickListener() {
            firebaseAuth.signOut()
            startActivity(Intent(this, HomeAgentActivity::class.java))
            finish()
        }

        mAuth = FirebaseAuth.getInstance()
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        val auth = Firebase.auth
        val user = auth.currentUser

        if (user != null) {
            val userName = user.displayName
            textUsername.text = "Hi, " + userName
        }

        val btnLogout = findViewById<ImageButton>(R.id.accountnavbarbtn)
        btnLogout.setOnClickListener {
            signOutAndStartSignInActivity()
        }
    }

    private fun signOutAndStartSignInActivity() {
        mAuth.signOut()
        mGoogleSignInClient.signOut().addOnCompleteListener(this) {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}