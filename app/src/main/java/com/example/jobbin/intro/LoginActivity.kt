package com.example.aplikasipart_time.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.jobbin.MainActivity
import com.example.jobbin.R

class LoginActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}