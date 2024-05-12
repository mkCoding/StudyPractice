package com.hfad.studypractice.assignments

fun main(){

    println(checkIfDivisibleBy7(10))

    for(i in 1..10){
        println(i)
    }
}

fun checkIfDivisibleBy7(number:Int):String{
    var result = ""
    if(number % 7 == 0){
        result = "$number is divisible by 7"
    }else if(number % 7 != 0){
        result = "$number is not divisible by 7"
    }

    return result
}