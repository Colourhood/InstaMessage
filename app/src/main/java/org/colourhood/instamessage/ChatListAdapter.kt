package org.colourhood.instamessage

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ChatListAdapter: RecyclerView.Adapter<ChatViewHolder>() {

    val names = listOf<String>("shelter", "church", "911","name1","name2"
            ,"name3","name4","name5","name6","name7","name8","name9","name10"
            ,"name11","name12","name13","name14","name15","name16","name17","name18")

    override fun getItemCount(): Int {
       return names.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ChatViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val chatlistelem = layoutInflater.inflate(R.layout.chat_list_element,parent,false)
        return ChatViewHolder(chatlistelem)
    }

    override fun onBindViewHolder(holder: ChatViewHolder?, position: Int) {
        holder?.name?.text = names[position]
    }
}

class ChatViewHolder(val view:View): RecyclerView.ViewHolder(view){
    val name: TextView

    init {
        name = view.findViewById(R.id.textView2)
    }
}