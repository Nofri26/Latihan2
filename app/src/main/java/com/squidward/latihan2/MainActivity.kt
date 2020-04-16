package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textregistrasi = findViewById<TextView>(R.id.registered)
        textregistrasi.setOnClickListener {
            startActivity(Intent(this, Registrasi::class.java))
        }
    }
}
