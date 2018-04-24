package org.colourhood.instamessage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class MessageViewActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_view)

        val recyclerView: RecyclerView = findViewById(R.id.message_recyclerView)
        val sendMessage: Button = findViewById(R.id.send_message_button)
        val messageEditText: EditText = findViewById(R.id.message_editText)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //TODO: This is just hardcoded data for testing. Will get rid of it when backend is ready.
        val userSampleKat = User("Katherine", "Seattle, WA", 1)
        val userSamleJacob = User("Jacob LU", "Bellevue, WA", 0)
        val userSampleAndrei = User("Andrei", "Seatlte, WA", 2)
        var users = setOf(userSamleJacob, userSampleAndrei, userSampleKat)

        val messages = ArrayList<UserMessage>()
        messages.add(UserMessage("Hello, Katherine. What is the plan for tonight?", userSampleAndrei))
        messages.add(UserMessage("We will go to UW for meeting tonight", userSampleKat))
        messages.add(UserMessage("Sounds good!", userSampleAndrei))
        messages.add(UserMessage("When do we leave?", userSampleAndrei))
        messages.add(UserMessage("I plan to head out around 6pm", userSampleKat))

        val adapter = MessageViewAdapter(messages)
        recyclerView.adapter = adapter

        sendMessage.setOnClickListener {
            val editMessage = messageEditText.text as? String
            editMessage?.let {
                // TODO: Will change the logic to current user after merge login page
                messages.add(UserMessage(editMessage, userSampleKat))
            }
        }
    }
}
