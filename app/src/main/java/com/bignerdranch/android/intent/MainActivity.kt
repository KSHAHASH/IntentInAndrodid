package com.bignerdranch.android.intent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

   private lateinit var name: EditText
   private lateinit var age: EditText
   private lateinit var send: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.firstEditText)
        age = findViewById(R.id.secondEditText)
        send = findViewById(R.id.submitButton)

        send.setOnClickListener {
            //taking data from this activity for the SecondActivity
            var userName:String = name.text.toString()
            var userAge:Int = age.text.toString().toInt()



            //provides runtime between this two activities
            //after starting the intent in this button it directs you to the another activity
            //named SecondActivity
            val intent =Intent(this@MainActivity,SecondActivity::class.java)
            //key and value
            intent.putExtra("username", userName)
            intent.putExtra("userage", userAge)
            startActivity(intent)

        }
    }
}