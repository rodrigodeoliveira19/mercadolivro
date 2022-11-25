package com.mercadolivro.exemplos

fun main(){

     //ListOf
     var list = listOf<Int>(1,2,3)
//     list.forEach {
//          println(it)
//     }

     //Set / MutableSet - Não permite valores repetidos
     var setNumeros = mutableSetOf<Int>(1,1,2,3,4,5,6,6)
     var list2: MutableSet<Int> = setNumeros

//     setNumeros.add(1)
//     setNumeros.forEach { println(it) }

     //Map / MutableMapOf
     var mapNomeIdade = mapOf<String,Int>("Rodrigo" to 29, "Daniel" to 20)
     var mapNomeIdade2 = mutableMapOf<String,Int>("Rodrigo" to 29, "Daniel" to 20)
     mapNomeIdade.forEach { t, u -> println(u)  }


}