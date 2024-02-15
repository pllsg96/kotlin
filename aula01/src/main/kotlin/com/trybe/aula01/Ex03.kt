package com.trybe.aula01

import kotlin.math.pow

fun main() {
    print("Digite sua altura: ")
    var altura: Double = readln().toDouble();

    print("Digite seu peso: ")
    var peso: Double = readln().toDouble();

    println("Seu IMC é igual a: ${calculaImc(altura, peso)}");
}

fun calculaImc(altura: Double, peso: Double): Double {
    return (peso / altura.pow(2.0));
}