package com.wiper.codehut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time:Long=4000

        Handler().postDelayed(Runnable{
            val intent= Intent(MainActivity@this,Login::class.java)
            startActivity(intent)
            finish()
        },time)
    }
}