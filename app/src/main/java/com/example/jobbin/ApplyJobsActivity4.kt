package com.example.jobbin

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ApplyJobsActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apply_jobs4)

        val button = findViewById<Button>(R.id.btn_apply_jobs4)
        val btnBack = findViewById<ImageView>(R.id.btn_back_apply4)

        btnBack.setOnClickListener{
            onBackPressed()
        }

        button.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.dialog_konfirmasi_apply,null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val yesBtn = dialogBinding.findViewById<Button>(R.id.btn_yes_dialog)
            val cancleBtn = dialogBinding.findViewById<Button>(R.id.btn_cancle_dialog)

            yesBtn.setOnClickListener {
                val dialogBinding2 = layoutInflater.inflate(R.layout.dialog_succes_apply, null)
                val myDialog2 = Dialog(this)
                myDialog2.setContentView(dialogBinding2)

                myDialog2.setCancelable(true)
                myDialog2.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                myDialog2.show()

                val homeBtn = dialogBinding2.findViewById<Button>(R.id.btn_home_dialog)

                homeBtn.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }

            cancleBtn.setOnClickListener {
                myDialog.dismiss()
            }
        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
    }

}