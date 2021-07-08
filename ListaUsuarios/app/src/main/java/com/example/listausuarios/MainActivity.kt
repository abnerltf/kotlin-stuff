package com.example.listausuarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(nome="Abner Lima", email="abnerltf@gmail.com", stack= Stack.BACKEND, senioridade= Senioridade.SENIOR, foto=resources.getDrawable(R.drawable.ic_launcher_background)),
            Usuario(nome="Vinicius Francisco", email="vinicius0078@gmail.com", stack= Stack.FRONTEND, senioridade= Senioridade.PLENO)
        )

        rv.adapter = UsuarioAdapter(lista)
        rv.layoutManager = LinearLayoutManager(this)
    }
}