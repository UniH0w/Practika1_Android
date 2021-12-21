package com.example.watch_eresdfd

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.watch_eresdfd.databinding.ActivitySplashScrennBinding

class SplashScreenActivity :  AppCompatActivity() {
    private lateinit var binding: ActivitySplashScrennBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScrennBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler().postDelayed({
            val intent = Intent(this, GetStartedActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}
