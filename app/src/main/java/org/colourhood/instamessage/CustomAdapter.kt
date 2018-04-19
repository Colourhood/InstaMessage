package org.colourhood.instamessage

import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

class CustomAdapter (val userList: ArrayList<User>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){




    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view : View = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
        when(viewType) {
            0 -> {
                view = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
                return ViewHolder1(view)
            }
            2 -> {
                view = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout_alt, parent, false)
                return ViewHolder2(view)

            }
        }
        return ViewHolder1(view)
    }

    override fun getItemViewType(position: Int): Int {
        return position %2 *2
    }

//    val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent, false)
//    return ViewHolder(v)

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder? {
//        var view: View? = null
//        var viewHolder: RecyclerView.ViewHolder? = null
//        when (viewType) {
//            0 -> {
//                view = View.inflate(parent.context, R.layout.list_item_empty_view, null)
//                viewHolder = EmptyViewHolder(view)
//            }
//            1 -> {
//                view = View.inflate(parent.context, R.layout.review_list_item, null)
//                viewHolder = ViewHolder(view)
//            }
//        }
//        return viewHolder
//    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val user: User = userList[position]
        if (position%2 ==0) {
            val holder1 = holder as ViewHolder1
            holder1.textViewName.text = user.name
            holder1.textViewAddress.text = user.address
        } else {
            val holder2 = holder as ViewHolder2
            holder2.textViewName1.text = user.name
            holder2.textViewAddress1.text = user.address
        }

    }

    class ViewHolder1(itemView: View) :RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById<TextView>(R.id.textViewName) as TextView
        val textViewAddress = itemView.findViewById<TextView>(R.id.textViewAddress) as TextView
    }

    class ViewHolder2(itemView: View) :RecyclerView.ViewHolder(itemView){
        val textViewName1 = itemView.findViewById<TextView>(R.id.textViewName1) as TextView
        val textViewAddress1 = itemView.findViewById<TextView>(R.id.textViewAddress1) as TextView

    }
}