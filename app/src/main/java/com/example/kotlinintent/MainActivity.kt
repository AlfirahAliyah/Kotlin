package com.example.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMasuk: Button = findViewById(R.id.btn_masuk)
        btnMasuk.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_masuk -> {
                    val intent = Intent(this@MainActivity, AbsenActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }

}