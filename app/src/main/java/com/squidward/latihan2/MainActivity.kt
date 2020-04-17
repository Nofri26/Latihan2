package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
/*
* NIM   : 10117139
* Nama  : Nofrizal
* Kelas : AKB-4 / IF-4
* Tugas : AKB Latihan 2
*
* Update :
* - 16 April =
*       - Membuat Halaman 1 & 2
*       - Upload Github
* - 17 april =
*       - Membuat halaman 3 - 5
*       - validasi dll
*
* */
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
