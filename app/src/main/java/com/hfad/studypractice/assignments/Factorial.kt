package com.hfad.studypractice.assignments

//Write program that finds factorial of a given number
fun main() {
    println(findFactorial(3))
}

fun findFactorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}