package com.example.malaika

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay to display the splash screen
        Handler(Looper.getMainLooper()).postDelayed({
            // Navigate to the main activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Close the splash screen activity
        }, 7000) // 7000ms = 7 seconds
    }
}
