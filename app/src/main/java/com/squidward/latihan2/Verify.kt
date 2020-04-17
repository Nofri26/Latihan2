package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_verify.*

class Verify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        var intent = intent
        val nama = intent.getStringExtra("Name")
        val darah = intent.getStringExtra("Blood")

        send.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            intent.putExtra("Name", nama)
            intent.putExtra("Blood", darah)
            startActivity(intent)
        }
    }
}
