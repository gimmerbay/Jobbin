package com.example.jobbin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailJobsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_jobs)

        val button = findViewById<Button>(R.id.btn_apply_detail)

        button.setOnClickListener {
            val intent = Intent(this ,ApplyJobsActivity1::class.java)
            startActivity(intent)
        }
    }
}