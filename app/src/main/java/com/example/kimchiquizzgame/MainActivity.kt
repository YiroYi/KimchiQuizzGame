package com.example.kimchiquizzgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val btnStart : Button = findViewById(R.id.btn_start)
    val etName: EditText = findViewById(R.id.et_name)

    btnStart.setOnClickListener {
      if(etName.text.isNotEmpty()) {
        val intent = Intent(this, QuickQuestionsActivity::class.java)
        startActivity(intent)
        finish() // Closes the current activity
      } else {
        Toast.makeText(this, "Please input a name", Toast.LENGTH_LONG).show()
      }
    }
  }
}