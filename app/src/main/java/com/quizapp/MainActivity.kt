package com.quizapp

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()) {
                Toast.makeText(this@MainActivity, "Mohon Masukkan Nama Anda!", Toast.LENGTH_SHORT)
                        .show()
            } else {
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }

        btn_about.setOnClickListener{
                val intentt = Intent(this@MainActivity, About::class.java)
                startActivity(intentt)
        }

        fun quitApp(view: View){
            this@MainActivity.finish()
            exitProcess(0)
        }
    }
}