package com.barisaytekin.chapter1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Section 3.1: String Equality
        val str1 = "Hello, World!"
        val str2 = "Hello," + " World!"
        println(str1 == str2)
    }
}