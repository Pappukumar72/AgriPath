/*
package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //val emailEditText = findViewById<EditText>(R.id.editTextEmail)
       // val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
       // val loginButton = findViewById<Button>(R.id.buttonLogin)
        //val signupTextView = findViewById<TextView>(R.id.textViewSignup)

        //loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            } else {
                // Here you would typically validate the credentials
                // and proceed with the login process.

                // For demonstration purposes, we'll show a success message.
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
            }
        }

        signupTextView.setOnClickListener {
            // Here you would typically navigate to a signup activity.
            Toast.makeText(this, "Signup functionality not implemented yet", Toast.LENGTH_SHORT).show()
        }
    }
}*/
