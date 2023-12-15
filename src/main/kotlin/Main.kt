package org.example

import java.util.Scanner

fun main() {
    val preuInicial = 73490
    val kilometres = readInt("Introdueix els kilometres de la teva Volkswagen Grand California: ", 0)

    val preuFinal = calcularValorMercat(preuInicial, kilometres)
    println("El valor de mercat de la Volkswagen Grand California és: $preuFinal €")
}

fun calcularValorMercat(preu: Int, kilometres: Int): Int {
    val perduaPercentual = 0.00001
    val perduaTotal = (preu * perduaPercentual * kilometres).toInt()
    return preu - perduaTotal
}

fun readInt(pMessage: String, pMin: Int): Int {
    var valor: Int = 0
    val scanner = Scanner(System.`in`)
    var correctType: Boolean

    do {
        println(pMessage)
        correctType = scanner.hasNextInt()

        if (!correctType) {
            println("ERROR: Siusplau, introdueix un número vàlid.")
        } else {
            valor = scanner.nextInt()

            if (valor < pMin) {
                println("ERROR: El valor ha de ser igual o superior a $pMin.")
                correctType = false
            }
        }

        scanner.nextLine()

    } while (!correctType)

    return valor
}
