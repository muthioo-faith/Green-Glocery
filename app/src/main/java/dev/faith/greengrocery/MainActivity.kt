package dev.faith.greengrocery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnget:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnget=findViewById(R.id.btnget)
        btnget.setOnClickListener {
            var intent=Intent(this,categories::class.java)
            startActivity(intent)
        }
    }
}