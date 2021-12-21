package com.example.watch_eresdfd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Calendar_Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar1)
        val butt = findViewById<Button>(R.id.button_prev_calendar)
        butt.setOnClickListener {
            startActivity(Intent(this, StopWatchActivity::class.java))
        }
    }
}