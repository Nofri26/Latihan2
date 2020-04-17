package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlmostThere : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)
        var btn_verify = findViewById<Button>(R.id.verify)
        btn_verify.setOnClickListener {
            startActivity(Intent(this, Verify::class.java))
        }
    }
}
