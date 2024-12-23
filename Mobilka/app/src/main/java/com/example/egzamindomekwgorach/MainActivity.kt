package com.example.egzamindomekwgorach

import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var counter = 0
        val LikeButton: Button = findViewById(R.id.Like_Button)
        val DeleteButton: Button = findViewById(R.id.Delete_Button)
        val LikeCounter: TextView = findViewById(R.id.Like_Counter_TextView)

        LikeButton.setOnClickListener {
            counter++
            LikeCounter.text = "$counter Polubień"
        }
        DeleteButton.setOnClickListener {
            if (counter >0){
                counter--
                LikeCounter.text = "$counter Polubień"
                DeleteButton.isEnabled = counter >= 0
            }

        }

    }
}