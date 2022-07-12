package dev.faith.greengrocery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class types : AppCompatActivity() {
    lateinit var btnveg: Button
    lateinit var btnonions: Button
    lateinit var btnfru: Button
    lateinit var btnproteins: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_types)
        btnveg = findViewById(R.id.btnveg)
        btnveg.setOnClickListener {
            var intent = Intent(this, Vegetables::class.java)
            startActivity(
                intent
            )
        }
        btnonions = findViewById(R.id.btnonions)
        btnonions.setOnClickListener {
            var intent = Intent(this, Onions::class.java)
            startActivity(intent)
        }

        btnfru = findViewById(R.id.btnfru)
        btnfru.setOnClickListener {
            var intent = Intent(this, fruits::class.java)
            startActivity(intent)

        }
        btnproteins = findViewById(R.id.btnproteins)
        btnproteins.setOnClickListener {
            var intent = Intent(this, proteins::class.java)
            startActivity(intent)
        }
    }
}