package com.example.app_daw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Terror : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terror)
    }
    fun MainActivity(view: View){

        val intent = Intent(this@Terror, MainActivity::class.java)
        startActivity(intent)
    }
}