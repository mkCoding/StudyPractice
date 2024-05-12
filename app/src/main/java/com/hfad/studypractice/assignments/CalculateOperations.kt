package com.hfad.studypractice.assignments

/*
  Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers.
 */
fun main(){
    println(addition(3,9))
    println(subtraction(30,6))
    println(multiplication(4,3))
    println(division(100,5))
}

fun addition(x:Int, y:Int):Int{
    return x + y
}

fun subtraction(x:Int, y:Int):Int{
    return x - y
}

fun multiplication(x:Int, y:Int):Int{
 return x * y
}

fun division(x:Int, y:Int):Int{
    return x / y
}




