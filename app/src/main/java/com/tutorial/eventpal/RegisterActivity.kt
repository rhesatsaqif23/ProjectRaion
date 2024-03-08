package com.tutorial.eventpal

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.userProfileChangeRequest
import com.tutorial.firebaseapp.R

class RegisterActivity : AppCompatActivity() {
    lateinit var editUsername: EditText
    lateinit var editEmail: EditText
    lateinit var editPassword: EditText
    lateinit var editpasswordConf: EditText
    lateinit var btnSignUp: Button
    lateinit var btnSignIn: Button
    lateinit var progressDialog: ProgressDialog
    val firebaseAuth = FirebaseAuth.getInstance()

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser != null) {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        editUsername = findViewById(R.id.username)
        editEmail = findViewById(R.id.email)
        editPassword = findViewById(R.id.password)
        editpasswordConf = findViewById(R.id.password_conf)

        btnSignUp = findViewById(R.id.btn_signup)
        btnSignIn = findViewById(R.id.btn_signin)

        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Loading")
        progressDialog.setMessage("Please wait...")

        btnSignIn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        btnSignUp.setOnClickListener {
            if (editUsername.text.isNotEmpty() && editEmail.text.isNotEmpty() && editPassword.text.isNotEmpty()) {
                if (editPassword.text.toString() == editpasswordConf.text.toString()) {
                    processSignUp()
                } else {
                    Toast.makeText(this, "Invalid password", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter all the required data", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun processSignUp() {
        val username = editUsername.text.toString()
        val email = editEmail.text.toString()
        val password = editPassword.text.toString()

        progressDialog.show()
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{ task ->
                if (task.isSuccessful) {
                    val userUpdateProfile = userProfileChangeRequest {
                        displayName = username
                    }
                    val user = task.result.user
                    user!!.updateProfile(userUpdateProfile)
                        .addOnCompleteListener {
                            progressDialog.dismiss()
                            startActivity(Intent(this, MainActivity::class.java))
                        }
                        .addOnFailureListener{ error ->
                            Toast.makeText(this, error.localizedMessage, Toast.LENGTH_SHORT).show()
                        }
                } else {
                    progressDialog.dismiss()
                }
            }
            .addOnFailureListener{ error ->
                Toast.makeText(this, error.localizedMessage, Toast.LENGTH_SHORT).show()
            }
    }
}