package com.example.subActivity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.androiddevkotlin.R

class SubActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sub)

        val returnButton: Button = findViewById(R.id.sub_button_a)
        returnButton.setOnClickListener{
            Toast.makeText(this, "message", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}