package com.example.atividadeavaliativa4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = intent

        val cliente: Cliente? = intent.getSerializableExtra("cliente") as Cliente?

        Toast.makeText(
            this, "Nome: ${cliente?.getNome()} \nemail: ${cliente?.getEmail()} \nCPF: ${cliente?.getCpf()} " +
                    "\nTelefone: ${cliente?.getTel()} \nEndereço: ${cliente?.getEndereco()} \nCidade: ${cliente?.getCidade()}",
            Toast.LENGTH_SHORT
        ).show()

    }

}