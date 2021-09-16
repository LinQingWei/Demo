package com.github.simple.notes.activity

import android.content.Intent
import com.github.simple.commons.activities.BaseSplashActivity

class SplashActivity : BaseSplashActivity() {

    override fun initActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}