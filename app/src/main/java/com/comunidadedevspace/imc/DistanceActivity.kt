package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class DistanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distance)

        val edtDistance = findViewById<TextInputEditText>(R.id.edt_distance)

        val btnNext3 = findViewById<Button>(R.id.btn_next3)
        btnNext3.setOnClickListener { val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            val distance: Float = edtDistance.text.toString().toFloat()

        }
    }
}