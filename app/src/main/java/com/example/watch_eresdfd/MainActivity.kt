package com.example.watch_eresdfd


import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.watch_eresdfd.databinding.ActivityMainBinding
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class MainActivity : AppCompatActivity() {
lateinit var  binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text  = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.y"))
        binding.nextMainButton.setOnClickListener {
            val intent = Intent(this, StopWatchActivity::class.java)
            startActivity(intent)
        }
    }
}
