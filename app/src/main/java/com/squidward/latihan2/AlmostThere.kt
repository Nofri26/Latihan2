package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_almost_there.*

class AlmostThere : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        var intent = intent
        val nama = intent.getStringExtra("Name")
        val gol_dar = intent.getStringExtra("Blood")

        verify.setOnClickListener {
            val intent = Intent(this, Verify::class.java)
            intent.putExtra("Name", nama)
            intent.putExtra("Blood", gol_dar)
            startActivity(intent)
        }
    }
}
