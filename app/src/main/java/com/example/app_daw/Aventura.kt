package com.example.app_daw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Aventura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aventura)
    }
    fun MainActivity(view: View){

        val intent = Intent(this@Aventura, MainActivity::class.java)
        startActivity(intent)
    }
}