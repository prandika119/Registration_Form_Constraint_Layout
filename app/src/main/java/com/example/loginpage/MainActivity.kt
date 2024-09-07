package com.example.loginpage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fun getName() : String{
            return binding.inpFullname.text.toString()
        }
        binding.btnSign.setOnClickListener {
            Toast.makeText(this, "Selamat datang " + getName(), Toast.LENGTH_SHORT).show()
        }

        }
    }