package org.colourhood.instamessage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginAndSignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_and_sign_up)

    }

    fun displaySignUpActivity(view: View) {
        findViewById<Button>(R.id.signUp_outside)
        startActivity(Intent(this,SignUpInside::class.java).apply {})
    }

    fun displaySignInActivity(view: View) {
        findViewById<Button>(R.id.signIn_Outside)
        startActivity(Intent(this,LoginInside::class.java).apply {})
    }
}
