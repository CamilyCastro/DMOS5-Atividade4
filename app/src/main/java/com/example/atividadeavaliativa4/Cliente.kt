package com.example.atividadeavaliativa4

import java.io.Serializable

class Cliente(private var nome: String, private var email: String, private var cpf: String,
              private var tel: String, private var endereco: String, private var cidade: String) : Serializable {

    fun getNome():String{
        return this.nome
    }

    fun getEmail():String{
        return this.email
    }
    fun getCpf():String{
        return this.cpf
    }
    fun getTel():String{
        return this.tel
    }
    fun getEndereco():String{
        return this.endereco
    }
    fun getCidade():String{
        return this.cidade
    }

    fun setNome(nome: String){
        this.nome = nome
    }

    fun setEmail(email: String){
        this.email = email
    }

    fun setCPF(cpf: String){
        this.cpf = cpf
    }

    fun setTel(tel: String){
        this.tel = tel
    }

    fun setEndereco(endereco: String){
        this.endereco = endereco
    }

    fun setCidade(cidade: String){
        this.cidade = cidade
    }
}