package com.example.watch_eresdfd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.watch_eresdfd.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.MainSignButton.setOnClickListener {
            val password = binding.editTextPasswordLogin.text.toString()
            val email = binding.editTextEmailLogin.text.toString()
            val valid = Validator(this)
            binding.inputLayoutEmailLogin.error = valid.checkEmail(email)
            binding.inputLayoutPasswordLogin.error = valid.checkPassword(password)
            if (binding.inputLayoutEmailLogin.error == null &&
                binding.inputLayoutPasswordLogin.error == null
            ) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Name", email)
                startActivity(intent)
            }
        }
        binding.mainTextSingnUp.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}