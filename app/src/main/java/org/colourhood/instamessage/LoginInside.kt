package org.colourhood.instamessage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginInside : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_inside)
        findViewById<TextView>(R.id.login_Inside).apply {}
    }


}
