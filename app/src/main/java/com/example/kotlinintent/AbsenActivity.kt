package com.example.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class AbsenActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNamaLengkap:EditText
    private lateinit var etKehadiran:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absen)

        etNamaLengkap = findViewById(R.id.edit_nama)
        etKehadiran = findViewById(R.id.edit_keterangan)

        val btnSubmit: Button = findViewById(R.id.btn_submit)
        btnSubmit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_submit -> {

                    val bundle = Bundle()
                    bundle.putString("Nama Lengkap", etNamaLengkap.text.toString())
                    bundle.putString("Kehadiran", etKehadiran.text.toString())

                    val intent = Intent(this@AbsenActivity, ListKehadiranActivity::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)

                }
            }
        }
    }
}