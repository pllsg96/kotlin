package com.trybe.aula01

fun main() {
    print("Digite o primeiro número: ");
    val num1: Float = readln().toFloat();

    print("Digite o segundo número: ");
    val num2: Float = readln().toFloat();

    print("Digite o terceiro número: ");
    val num3: Float = readln().toFloat();

    print("O valor da média é: ${calcularMedia(num1, num2, num3)}")
}

fun calcularMedia(a:Float, b:Float, c:Float): Float{
    return (a+b+c)/3;
}