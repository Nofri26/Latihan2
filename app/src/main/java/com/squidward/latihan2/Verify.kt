package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        var btn_send = findViewById<Button>(R.id.send)
        btn_send.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
