package org.colourhood.instamessage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class ChatListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list_view)

        val ChatList_recycleView = findViewById<RecyclerView>(R.id.recyclerView_ChatList) as RecyclerView

        ChatList_recycleView.layoutManager = LinearLayoutManager(this)
        ChatList_recycleView.adapter = ChatListAdapter()


    }
}
