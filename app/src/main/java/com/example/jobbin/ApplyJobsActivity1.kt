package com.example.jobbin

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ApplyJobsActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apply_jobs1)

        val button = findViewById<Button>(R.id.btn_apply_jobs1)
        val btnBack = findViewById<ImageView>(R.id.btn_back_apply)

        button.setOnClickListener {
            val intent = Intent(this, ApplyJobsActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }

        btnBack.setOnClickListener{
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
    }

}