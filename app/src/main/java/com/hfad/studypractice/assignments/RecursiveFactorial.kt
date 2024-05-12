package com.hfad.studypractice.assignments

//Write a recursive function that prints factorial of number passed in
fun main() {
    println( recursiveFactorial(3))
}

fun recursiveFactorial(number: Int): Int {
    if (number == 1) {
        return 1
    }
    return number * recursiveFactorial(number - 1)

}