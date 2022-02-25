package com.example.fragmentdisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val FragmentManager = supportFragmentManager


        val btnA : Button = findViewById(R.id.btnA)
        val btnB : Button = findViewById(R.id.btnB)
        val btnPut : Button = findViewById(R.id.btnPut)

        btnA.setOnClickListener(){
            val fragmentTrans = FragmentManager.beginTransaction()
            val fragment = AFragment()

            fragmentTrans.replace(R.id.fragmentContainer, fragment)
            fragmentTrans.commit()
        }

        btnB.setOnClickListener(){
            val fragmentTrans = FragmentManager.beginTransaction()
            val fragment = BFragment()

            fragmentTrans.replace(R.id.fragmentContainer, fragment)
            fragmentTrans.commit()
        }

        btnPut.setOnClickListener(){
            val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as AFragment

            fragment.requireView().findViewById<TextView>(R.id.tvResult).text = "John"
        }
    }
}