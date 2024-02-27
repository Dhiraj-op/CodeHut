package com.wiper.codehut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Button=findViewById<Button>(R.id.register_btn)
        Button.setOnClickListener {
            val intent=Intent(this@Register,Home::class.java)
            startActivity(intent)
        }
    }
}