package org.colourhood.instamessage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        val button = findViewById<Button>(R.id.button) as Button
        val text = findViewById<EditText>(R.id.editText) as EditText


        button.setOnClickListener() {
            text.setText("")
        }
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("Jacob LU", "Bellevue, WA"))
        users.add(User("Jacob Lu1", "Bellevue1, WA"))
        users.add(User("Jacob Lu2", "Bellevue1, WA"))
        users.add(User("Jacob Lu31421", "Bellevue3223, WA"))
        users.add(User("Jacob Lu1122241", "Bellevue123, WA"))
        users.add(User("Jacob Lu", "Bellevue234234, WA"))
        users.add(User("Jacob Lu1", "Bellevue1, WA"))
        users.add(User("Jacob Lu2", "Bellevue1, WA"))
        users.add(User("Jacob Lu31421", "Bellevue3223, WA"))
        users.add(User("Jacob Lu1122241", "Bellevue123, WA"))
        users.add(User("Jacob Lu1", "Bellevue1, WA"))
        users.add(User("Jacob Lu2", "Bellevue1, WA"))
        users.add(User("Jacob Lu31421", "Bellevue3223, WA"))
        users.add(User("Jacob Lu1122241", "Bellevue123, WA"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}
