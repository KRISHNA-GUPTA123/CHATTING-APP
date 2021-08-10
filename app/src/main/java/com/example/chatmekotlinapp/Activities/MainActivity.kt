package com.example.chatmekotlinapp.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chatmekotlinapp.Fragment.GetUserNumber
import com.example.chatmekotlinapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, GetUserNumber())
            .commit()
    }
}