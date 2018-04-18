package org.colourhood.instamessage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun signUp(view: View) {
        val invokeSignUp = findViewById<Button>(R.id.signUp_outside)
        val intent = Intent(this,SignUpInside::class.java).apply {

        }
        startActivity(intent)
    }

    fun signIn(view:View) {
        val invokeSingIn = findViewById<Button>(R.id.signIn_Outside)
        val intent = Intent(this,LoginInside::class.java).apply {  }
        startActivity(intent)

    }
}
