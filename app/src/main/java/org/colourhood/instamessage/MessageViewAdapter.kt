package org.colourhood.instamessage

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MessageViewAdapter(private val userMessage: ArrayList<UserMessage>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_MESSAGE_SENT: Int = 1
        const val VIEW_TYPE_MESSAGE_RECEIVED: Int = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view : View = LayoutInflater.from(parent?.context).inflate(R.layout.send_message_list, parent, false)

        when(viewType) {
            VIEW_TYPE_MESSAGE_SENT -> {
                view = LayoutInflater.from(parent?.context).inflate(R.layout.send_message_list, parent, false)
                return SentMessageViewHolder(view)
            }
            VIEW_TYPE_MESSAGE_RECEIVED -> {
                view = LayoutInflater.from(parent?.context).inflate(R.layout.receive_message_list, parent, false)
                return ReceivedMessageViewHolder(view)
            }
        }
        return SentMessageViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int {
        val message: UserMessage = userMessage.get(position)
        // TODO: Will change this to current user after merge login logic
        if (message.user.id == 1) {
            return VIEW_TYPE_MESSAGE_SENT
        } else {
            return VIEW_TYPE_MESSAGE_RECEIVED
        }
    }

    override fun getItemCount(): Int {
        return userMessage.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val message: UserMessage = userMessage[position]

        when (holder?.itemViewType) {
            VIEW_TYPE_MESSAGE_SENT -> {
                val sentMessageViewHolder = holder as? SentMessageViewHolder
                sentMessageViewHolder?.sentText?.text = message.message
                sentMessageViewHolder?.sentAddress?.text = message.user.name
            }

            VIEW_TYPE_MESSAGE_RECEIVED -> {
                val receivedMessageViewHolder = holder as? ReceivedMessageViewHolder
                receivedMessageViewHolder?.receiveText?.text = message.message
                receivedMessageViewHolder?.receiveAddress?.text = message.user.name
            }
        }
    }
}