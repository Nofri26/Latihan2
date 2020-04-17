package com.squidward.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    lateinit var home_nama2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        home_nama2 = findViewById(R.id.home_nama)
        val name =intent.getStringArrayExtra("username")
        home_nama2.text = "hallo "+name
    }
}
