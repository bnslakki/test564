package com.example.aksbansa.journaler.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.example.aksbansa.journaler.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?,
                          persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }
}