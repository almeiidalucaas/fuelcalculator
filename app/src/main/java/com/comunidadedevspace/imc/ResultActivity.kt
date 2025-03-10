package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val distance = intent.getFloatExtra("distance", 0.0f)



        // Total Price = (distance/consumo) * fuel price

        val btnRestart = findViewById<Button>(R.id.btn_restart)
        btnRestart.setOnClickListener { val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}