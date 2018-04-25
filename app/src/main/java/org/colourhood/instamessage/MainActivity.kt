package org.colourhood.instamessage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var b = findViewById<Button>(R.id.button) as Button

        b.setOnClickListener {

            val intentChatList = Intent(this, ChatListView::class.java)
            startActivity(intentChatList)
        }

        val pushToMessageView: Button = findViewById(R.id.message_view_button)
        pushToMessageView.setOnClickListener {
            val intent = Intent(this, MessageViewActivity::class.java)
            startActivity(intent)
        }
    }
}