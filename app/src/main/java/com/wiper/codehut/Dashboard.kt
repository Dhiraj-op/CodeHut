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


class Dashboard : Fragment() {
    private lateinit var myButton: CardView
    private lateinit var myButton1: CardView
    private lateinit var myButton2: CardView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val url = "https://www.codechef.com/START90"
        val url1="https://www.codingninjas.com/courses"
            val url2="https://practice.geeksforgeeks.org/courses"
        myButton = view.findViewById(R.id.card_view)
        myButton1=view.findViewById(R.id.card_view1)
        myButton2=view.findViewById(R.id.card_view2)

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

    }
}
