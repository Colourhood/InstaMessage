package org.colourhood.instamessage

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class SentMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val sentText = itemView.findViewById<TextView>(R.id.sentText) as TextView
    val sentAddress = itemView.findViewById<TextView>(R.id.sentAddress) as TextView
}

class ReceivedMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val receiveText = itemView.findViewById<TextView>(R.id.receiveText) as TextView
    val receiveAddress = itemView.findViewById<TextView>(R.id.receiveAddress) as TextView
}