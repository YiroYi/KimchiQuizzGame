package com.example.kimchiquizzgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuickQuestionsActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_quick_questions)

    val questionList = Constants.getQuestions()
    Log.i("QuestionsList size is", "${questionList.size}")
  }
}