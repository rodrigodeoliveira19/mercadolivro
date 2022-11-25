package com.mercadolivro.exemplos

fun main(){

    //Add ? - Permite nulo.
    // !! -  Vc garante q nao é nulo. Mas se a variavel estiver null, ocorre uma exception.
    var nome: String? = null

//    print(nome!!.length)

    //Se for nulo, seta 10.
    var tamanho: Int = nome?.length ?: 10
    print(tamanho)
}