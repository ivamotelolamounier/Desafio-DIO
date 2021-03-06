/*
Primeiros passos em Kotlin
1 / 3 — Sequência Lógica

Detalhe

Desenvolva um programa capaz de ler um valor inteiro N.
N * 2 linhas de saída vão ser apresentadas na execução do programa,
seguindo a lógica do exemplo mais abaixo.
Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.
*/

import kotlin.math.pow

fun main() {
    //println("Entre com um número: ")
    val n = 1..(readLine() ?: return).toInt()
    n.forEach {
        println(it.toString() + " "
                + it.toDouble().pow(2).toInt().toString() + " "
                + it.toDouble().pow(3).toInt().toString())

        println(it.toString() + " "
                + (it.toDouble().pow(2).toInt() + 1).toString() + " "
                + (it.toDouble().pow(3).toInt() + 1).toString())
    }
}
