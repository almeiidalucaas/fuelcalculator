package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class FuelPriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fuel_price)

        val edtPrice = findViewById<TextInputEditText>(R.id.edt_fprice)

        val btnNext1 = findViewById<Button>(R.id.btn_next1)
        btnNext1.setOnClickListener { val intent = Intent(this, ConsumptionActivity::class.java)
            startActivity(intent)
            val price: Float = edtPrice.text.toString().toFloat()
            println("Lucas")


        }
    }
}