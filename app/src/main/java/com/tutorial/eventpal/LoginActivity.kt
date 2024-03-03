package com.tutorial.eventpal

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.google.firebase.auth.FirebaseAuth
import com.tutorial.firebaseapp.R

class LoginActivity : AppCompatActivity() {

    lateinit var editUsername: EditText
    lateinit var editPassword: EditText
//    lateinit var btnRegister: Button
//    lateinit var btnLogin: Button
//    lateinit var progressDialog: ProgressDialog

    var firebaseAuth = FirebaseAuth.getInstance()

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser != null) {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editUsername = findViewById(R.id.username)
        editPassword = findViewById(R.id.password)
//        btnRegister = findViewById(R.id.btn_register)
//        btnLogin = findViewById(R.id.btn_login)

//        progressDialog = ProgressDialog(this)
//        progressDialog.setTitle("Logging")
//        progressDialog.setMessage("Silahkan tunggu...")

//        btnLogin.setOnClickListener {
//            if (editUsername.text.isNotEmpty() && editPassword.text.isNotEmpty()) {
//                processLogin()
//            } else {
//                Toast.makeText(this, "Silahkan isi email dan password terlebih dahulu", LENGTH_SHORT).show()
//            }
        }
//        btnRegister.setOnClickListener {
//            startActivity(Intent(this, RegisterActivity::class.java))
//        }
//    }

//    private fun processLogin() {
//        val username = editUsername.text.toString()
//        val password = editPassword.text.toString()
//
//        progressDialog.show()
//        firebaseAuth.signInWithEmailAndPassword(username, password)
//            .addOnSuccessListener {
//                startActivity(Intent(this, MainActivity::class.java))
//            }
//            .addOnFailureListener{ error ->
//                Toast.makeText(this, error.localizedMessage, LENGTH_SHORT).show()
//            }
//            .addOnCompleteListener{
//                progressDialog.dismiss()
//            }
//    }
}