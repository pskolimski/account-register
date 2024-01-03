package com.example.rejestrujkonto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.rejestrujkonto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = binding.registerButton
        val emailInput = binding.emailInput
        val passwordInput = binding.passwordInput
        val repeatPasswordInput = binding.repeatPasswordInput
        val feedback = binding.feedback

        button.setOnClickListener() {
            if (!emailInput.text.toString().contains("@")) {
                feedback.text = "Nieprawidłowy adres e-mail"
            } else if (passwordInput.text.toString() != repeatPasswordInput.text.toString()) {
                feedback.text = "Hasła się różnią"
            } else {
                feedback.text = "Witaj " + emailInput.text.toString()
            }
        }
    }
}