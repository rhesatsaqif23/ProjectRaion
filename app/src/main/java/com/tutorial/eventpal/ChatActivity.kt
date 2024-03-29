package com.tutorial.eventpal

import ChatAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.firebaseapp.R

class ChatActivity : AppCompatActivity() {

    private lateinit var chatAdapter: ChatAdapter
    private lateinit var messageEditText: EditText
    private lateinit var btnAttach: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val chatRecyclerView: RecyclerView = findViewById(R.id.chatRecyclerView)
        messageEditText = findViewById(R.id.username)
        val sendButton: ImageButton = findViewById(R.id.btn_send)

        chatAdapter = ChatAdapter(mutableListOf())
        chatRecyclerView.adapter = chatAdapter
        chatRecyclerView.layoutManager = LinearLayoutManager(this)

        sendButton.setOnClickListener {
            val message = messageEditText.text.toString().trim()
            if (message.isNotEmpty()) {
                sendMessage(message)
            }
        }

        btnAttach = findViewById(R.id.btn_attach)
        btnAttach.setOnClickListener {
            val intent = Intent(this, PaymentActivity1::class.java)
            startActivity(intent)
        }
    }

    private fun sendMessage(message: String) {
        val chatMessage = ChatMessage(message)
        chatAdapter.addMessage(chatMessage)
        messageEditText.text.clear()
    }
}