package com.example.watch_eresdfd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.watch_eresdfd.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.RegisterButton.setOnClickListener {
            val valid = Validator(this)
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()
            val confimPassword = binding.editTextConfirmPassword.text.toString()

            binding.inputLayoutEmailRegistration.error = valid.checkEmail(email)
            binding.inputLayoutPasswordRegistration.error = valid.checkPassword(password)
            binding.inputLayoutConfirmPasswordRegistration.error =
                valid.confirmPassword(password, confimPassword)
            if (binding.inputLayoutPasswordRegistration.error == null &&
                binding.inputLayoutEmailRegistration.error == null &&
                binding.inputLayoutConfirmPasswordRegistration.error == null
            ) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Name", email)
                startActivity(intent)
            }
        }
        binding.textViewRegisterSingIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
