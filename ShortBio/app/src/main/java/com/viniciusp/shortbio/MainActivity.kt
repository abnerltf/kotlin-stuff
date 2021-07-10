package com.viniciusp.shortbio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var btnSobre : Button
    private lateinit var btnFormacao : Button
    private lateinit var btnExperiencia : Button
    private lateinit var btnObjetivo : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSobre = findViewById(R.id.btnSobre)
        btnFormacao = findViewById(R.id.btnFormacao)
        btnExperiencia = findViewById(R.id.btnExperiencia)
        btnObjetivo = findViewById(R.id.btnObjetivo)

        btnSobre.setOnClickListener {
            startActivity(Intent(this@MainActivity, SobreActivity::class.java))
        }

        btnFormacao.setOnClickListener {
            startActivity(Intent(this@MainActivity, FormacaoActivity::class.java))
        }

        btnExperiencia.setOnClickListener {
            startActivity(Intent(this@MainActivity, ExperienciaActivity::class.java))
        }

        btnObjetivo.setOnClickListener {
            startActivity(Intent(this@MainActivity, ObjetivoActivity::class.java))
        }
    }
}