package org.colourhood.instamessage

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomAdapter (val userList: ArrayList<User>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view : View = LayoutInflater.from(parent?.context).inflate(R.layout.sent_message_list, parent, false)
        when(viewType) {
            0 -> {
                view = LayoutInflater.from(parent?.context).inflate(R.layout.sent_message_list, parent, false)
                return SentMessageViewHolder(view)
            }
            2 -> {
                view = LayoutInflater.from(parent?.context).inflate(R.layout.received_message_list, parent, false)
                return ReceivedMessageViewHolder(view)
            }
        }
        return SentMessageViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int {
        return position %2 *2
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val user: User = userList[position]
        if (position%2 ==0) {
            val holder1 = holder as SentMessageViewHolder
            holder1.sentText.text = user.name
            holder1.sentAddress.text = user.address
        } else {
            val holder2 = holder as ReceivedMessageViewHolder
            holder2.receiveText.text = user.name
            holder2.receiveAddress.text = user.address
        }

    }

    class SentMessageViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val sentText = itemView.findViewById<TextView>(R.id.sentText) as TextView
        val sentAddress = itemView.findViewById<TextView>(R.id.sentAddress) as TextView
    }

    class ReceivedMessageViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val receiveText = itemView.findViewById<TextView>(R.id.receiveText) as TextView
        val receiveAddress = itemView.findViewById<TextView>(R.id.receiveAddress) as TextView
    }
}