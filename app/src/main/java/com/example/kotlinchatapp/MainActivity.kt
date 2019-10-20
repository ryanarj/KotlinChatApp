package com.example.kotlinchatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()

        Log.d("MainActivity", "Email is $email")
        Log.d("MainActivity", "Password is $password")


    }
}
