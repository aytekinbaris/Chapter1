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

        //
        val str1x = """ |Hello, World!""".trimMargin()   // adresi str1

        val str2x = """ #Hello, World!""".trimMargin("#") // adres str2

        val str3x = str1x  // str3 = str1 adresine sahip

        println(str1x)
        println(str2x)

        println(str1x == str2x) // Prints true
        println(str1x === str2x) // Prints false
        println(str1x === str3x) // Prints true






    }
}