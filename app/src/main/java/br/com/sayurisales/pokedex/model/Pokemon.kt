package br.com.sayurisales.pokedex.model

data class Pokemon(
        val numero: Int,
        val nome: String,
        val tipo:String,
        val descricao: String,
        val resourceId:Int
)