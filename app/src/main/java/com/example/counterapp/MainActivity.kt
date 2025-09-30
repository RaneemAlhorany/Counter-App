package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val score_text = findViewById<TextView>(R.id.score_text)
        val  addOneButton = findViewById<Button>(R.id.addOne)

        score_text.text = 0.toString()
        addOneButton.setOnClickListener {
            score_text.text =  (score_text.text.toString().toInt() +1) .toString()





        }
    }
}