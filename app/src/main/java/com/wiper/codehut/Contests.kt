package com.wiper.codehut

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment


class Contests : Fragment() {
    private lateinit var myButton: CardView
    private lateinit var myButton1: CardView
    private lateinit var myButton2: CardView
    private lateinit var myButton3: CardView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contests, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val url = "https://leetcode.com/contest/weekly-contest-346/"
        val url1="https://www.codechef.com/START90"
        val url2="https://www.hackerrank.com/dtcc-codeathon-challeng"
        val url3="https://www.codechef.com/CDHT2023"
        myButton = view.findViewById(R.id.post1)
        myButton1=view.findViewById(R.id.post2)
        myButton2=view.findViewById(R.id.post3)
        myButton3=view.findViewById(R.id.post4)

        myButton.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse(url)
            startActivity(openURL)
        }

        myButton1.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse(url1)
            startActivity(openURL)
        }

        myButton2.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse(url2)
            startActivity(openURL)
        }
        myButton3.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse(url2)
            startActivity(openURL)
        }

    }
}
