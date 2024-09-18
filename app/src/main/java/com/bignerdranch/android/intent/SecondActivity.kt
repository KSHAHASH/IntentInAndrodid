package com.bignerdranch.android.intent

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        result = findViewById(R.id.simpleTextView)

        //type of userName variable is string so getStringExtra
        //make sure it's the same key for username
        var userName:String = intent.getStringExtra("username").toString()
        var userAge: Int = intent.getIntExtra("userage", 0).toString().toInt()

        result.text = "Your name is $userName and your age is $userAge "



    }
}