package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class ConsumptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumption)

        val edtConsumo = findViewById<TextInputEditText>(R.id.edt_consumo)

        val btnNext2 = findViewById<Button>(R.id.btn_next2)
        btnNext2.setOnClickListener { val intent = Intent(this, DistanceActivity::class.java)
            startActivity(intent)
            val consumo: Float = edtConsumo.text.toString().toFloat()
        }
    }
}