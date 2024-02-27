package com.wiper.codehut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


private lateinit var signOutBtni:ImageView
class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        signOutBtni = findViewById(R.id.SignOut)

        signOutBtni.setOnClickListener {
            Firebase.auth.signOut()
            Toast.makeText(this, "Logout Successfully", Toast.LENGTH_SHORT).show()
            startActivity(Intent(Dashboard@ this, Login::class.java))

        }

        val dashboardfragment = Dashboard()
        val contestsfragment = Contests()
        val pathfragment = Path()
        val profilefragment = Profile()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bot_navi)

        replaceFragment(dashboardfragment)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> replaceFragment(dashboardfragment)
                R.id.contests -> replaceFragment(contestsfragment)
                R.id.path -> replaceFragment(pathfragment)
                R.id.profile -> replaceFragment(profilefragment)
            }
            true
        }
    }



    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame, fragment)
            transaction.commit()
        }
    }
}