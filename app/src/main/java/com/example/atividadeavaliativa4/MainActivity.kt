package com.example.atividadeavaliativa4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var edtName: TextView
    lateinit var edtEmail:TextView
    lateinit var edtCpf: TextView
    lateinit var edtTel:TextView
    lateinit var edtEndereco: TextView
    lateinit var edtCidade:TextView
    lateinit var btnSalvar: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.edt_name)
        edtEmail = findViewById(R.id.edt_email)
        edtCpf = findViewById(R.id.edt_cpf)
        edtTel = findViewById(R.id.edt_tel)
        edtEndereco = findViewById(R.id.edt_address)
        edtCidade = findViewById(R.id.edt_city)
        btnSalvar = findViewById(R.id.btn_save)

        }
        fun onClickBtnSave(view: View?) {
            val intent = Intent(this, Screen2::class.java)

            val nome : String = edtName.text.toString()
            val email : String = edtEmail.text.toString()
            val cpf : String = edtCpf.text.toString()
            val tel : String = edtTel.text.toString()
            val endereco : String = edtEndereco.text.toString()
            val cidade : String = edtCidade.text.toString()

            // enviar um objeto da classe Cliente
            val cliente = Cliente(nome, email, cpf, tel, endereco, cidade)
            intent.putExtra("cliente", cliente)

            startActivity(intent)
        }
}