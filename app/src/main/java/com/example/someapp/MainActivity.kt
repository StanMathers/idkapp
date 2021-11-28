package com.example.someapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var registered: Button
    lateinit var register: Button

    lateinit var username: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.username)

        registered = findViewById(R.id.alreadyRegistered)
        registered.setOnClickListener {
            val defaultWelcome: String = "Hello Kate"

            val intent = Intent(this, SignInPage::class.java)
            intent.putExtra("DefaultWelcome", defaultWelcome)
            startActivity(intent)
        }

        register = findViewById(R.id.register)
        register.setOnClickListener {
            val user: String = username.text.toString()

            val secondIntent = Intent(this, SignInPage::class.java)
            secondIntent.putExtra("USERNAME", user)

            startActivity(secondIntent)
        }
    }
}