package dev.faith.greengrocery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class categories : AppCompatActivity() {
    lateinit var btnwelcome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        btnwelcome=findViewById(R.id.btnwelcome)
        btnwelcome.setOnClickListener {
            var intent=Intent(this,types::class.java)
            startActivity(intent)
        }
    }
}