package com.guren.learncoding.ui.module

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.guren.learncoding.R
import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.guren.learncoding.MainActivity
import com.guren.learncoding.ui.module.home.HomeActivity


class SplashActivity : AppCompatActivity() {

    private val splashTimeOut :Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }, splashTimeOut)
    }
}