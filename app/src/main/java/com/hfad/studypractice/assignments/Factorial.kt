package com.hfad.studypractice.assignments

//Write program that finds factorial of a given number
fun main (){

    println(findFactorial(7))
}

fun findFactorial(x:Int):Int{
    var factorialResult = 1

    for(i in 1 ..x){
        factorialResult = factorialResult * i
//        println(i)
    }
    return factorialResult
}