package com.squidward.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    lateinit var nama : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var intent = intent
        val nama = intent.getStringExtra("Name")
        val goldar = intent.getStringExtra("Blood")

        //tampilin ke textview
        val DataNama = findViewById<TextView>(R.id.home_nama)
        DataNama.text = nama

        val DataDarah = findViewById<TextView>(R.id.home_blood_type)
        DataDarah.text = "Blood Type : " + goldar
    }
}
