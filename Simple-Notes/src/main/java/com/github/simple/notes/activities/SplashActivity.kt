package com.github.simple.notes.activities

import android.annotation.SuppressLint
import android.content.Intent
import com.github.simple.common.BaseSplashActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseSplashActivity() {

    override fun initActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}