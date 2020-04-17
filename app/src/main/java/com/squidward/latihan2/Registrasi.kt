package com.squidward.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Registrasi : AppCompatActivity() {
    var BloodType: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        var field_username = findViewById<EditText>(R.id.register_edit_username)
        val jenis_darah = resources.getStringArray(R.array.blood_type)

        //akses spinner
        val bloodtype = findViewById<Spinner>(R.id.spinner_blood_type)
        if (bloodtype != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, jenis_darah
            )
            bloodtype.adapter = adapter

            bloodtype.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    BloodType = bloodtype.getSelectedItem().toString()
                }
                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }
        }

        var btn_register = findViewById<Button>(R.id.register)
        btn_register.setOnClickListener {
            var name = field_username.text.toString()
            var blood_type = BloodType.toString()

            //validasi
            if (name.equals("")) {
                Toast.makeText(this, "Silahkan Masukkan Usernamenya", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (blood_type.equals("Blood Type")) {
                Toast.makeText(this, "Silahkan Pilih Golongan Darahnya", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                val intent = Intent(this, AlmostThere::class.java)
                intent.putExtra("Name", name)
                intent.putExtra("Blood", blood_type)
                startActivity(intent)
            }
        }
    }
}
