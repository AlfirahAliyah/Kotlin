package com.example.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class ListKehadiranActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNamaLengkap:EditText
    private lateinit var etKehadiran:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_kehadiran)

        etNamaLengkap = findViewById(R.id.edit_nama)
        etKehadiran = findViewById(R.id.edit_keterangan)

        val bundle = intent.extras
        if (bundle != null) {
            etNamaLengkap.setText(bundle.getString("Nama Lengkap"))
            etKehadiran.setText(bundle.getString("Kehadiran"))
        }

        val btnLanjut: Button = findViewById(R.id.btn_lanjut)
        btnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_lanjut -> {
                    val intent = Intent(this@ListKehadiranActivity, AfterSubmitActivity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}