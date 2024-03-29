package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.cadastro.Usuario

class SecondActivity : AppCompatActivity() {
    lateinit var textgrid: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textgrid = findViewById(R.id.txtGrid)

        val usuario = intent.extras?.get("USUARIO") as Usuario

        listaUsuario.add("${usuario.nome}, ${usuario.idade}")

        textgrid.text = listaUsuario.toString()

        Toast.makeText(this, usuario.nome, Toast.LENGTH_LONG).show()
    }

    companion object{
        val listaUsuario = mutableListOf<String>()
    }
}