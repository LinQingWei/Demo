package com.github.simple.commons.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseSplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivity()
    }

    abstract fun initActivity()
}