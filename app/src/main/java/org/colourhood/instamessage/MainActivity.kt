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
    fun displayTheSignUpLogin(view:View) {
        findViewById<Button>(R.id.button_test)
        startActivity(Intent(this,LoginAndSignUp::class.java)).apply {}
    }


}
