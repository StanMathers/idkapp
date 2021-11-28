package com.example.someapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.net.PasswordAuthentication

class SignInPage : AppCompatActivity() {
    lateinit var welcome: TextView

    lateinit var loginBtn: Button
    lateinit var email: TextView
    lateinit var password: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)


        val defaultEmail = "email@example.com"
        val defaultPassword = "somePassword"

        welcome = findViewById(R.id.welcomeText)
        welcome.text = intent?.extras?.getString("USERNAME", "HELLO KETI")

        loginBtn = findViewById(R.id.loginButton)

        email = findViewById(R.id.userEmail)
        password = findViewById(R.id.userPassword)

        loginBtn.setOnClickListener {
            val eMail = email.text.toString()
            val passw = password.text.toString()
            if(eMail == defaultEmail && passw == defaultPassword){
                Toast.makeText(this, "Logged in", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Wrong Email or Password", Toast.LENGTH_LONG).show()
            }
        }


    }
}