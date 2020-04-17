package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Registrasi : AppCompatActivity() {

    private lateinit var btn_register: Button
    private lateinit var field_username: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        btn_register = findViewById(R.id.register)
        field_username = findViewById(R.id.register_edit_username)

        btn_register.setOnClickListener {
            val intent = Intent(this, AlmostThere::class.java)
            intent.putExtra("username", field_username.text.toString())
            startActivity(intent)
        }
    }
}
