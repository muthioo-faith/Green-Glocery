package dev.faith.greengrocery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Vegetables : AppCompatActivity() {
    lateinit var btnCabbage: Button
    lateinit var btnMchicha: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetables)
        btnCabbage = findViewById(R.id.btnCabbage)
        btnCabbage.setOnClickListener {
            var intent = Intent(this, CabbApriceActivity::class.java)
            startActivity(intent)
        }
        btnMchicha = findViewById(R.id.btnMchicha)
        btnMchicha.setOnClickListener {
            var intent = Intent(this,DaniaActivity::class.java)
            startActivity(intent)
        }
    }
}