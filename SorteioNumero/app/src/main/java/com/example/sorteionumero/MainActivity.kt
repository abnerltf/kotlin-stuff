package com.example.sorteionumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View;
import android.widget.TextView;
import android.widget.Toast
import java.util.Random;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SortearNumero(view: View){
        var texto = findViewById(R.id.txtNumero) as TextView

        var numeroSorteado = Random().nextInt(11)

        texto.setText("O número é: $numeroSorteado");
        notifyRoll()
    }

    private fun notifyRoll() {
        Toast.makeText(this, "Número gerado", Toast.LENGTH_LONG).show()
    }
}