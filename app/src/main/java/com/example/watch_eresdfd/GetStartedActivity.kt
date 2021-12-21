package com.example.watch_eresdfd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
        val butt = findViewById<Button>(R.id.get_started_button)
        butt.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
