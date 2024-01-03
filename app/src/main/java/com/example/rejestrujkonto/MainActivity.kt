package com.example.rejestrujkonto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rejestrujkonto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}