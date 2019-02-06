package com.example.theoffice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

import android.provider.AlarmClock.EXTRA_MESSAGE

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button  */
    fun allQuotes(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java)

        startActivity(intent)

    }

    fun quoteOTD(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java)

        startActivity(intent)

    }

    companion object {

        val EXTRA_MESSAGE = "Hello"
    }
}
