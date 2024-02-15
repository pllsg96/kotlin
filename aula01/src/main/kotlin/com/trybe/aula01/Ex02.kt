package com.trybe.aula01

fun main() {
    print("Digite seu salário mensal: ");
    var salario: Double = readln().toDouble();

    var gratificacao: Double = salario * 0.05;
    var imposto: Double = salario * 0.07;

    println("Seu salário final, após todos os descontos é ${salario - imposto + gratificacao}");
}