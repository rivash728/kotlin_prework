package com.example.kotlin_prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Function when the app is being created to run
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener{
            Toast.makeText(this,"Test Toast", Toast.LENGTH_SHORT).show();

        }
    }
}