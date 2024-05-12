package com.hfad.studypractice.assignments

//write a program that checks if a number is positive, negative or zero
fun main(){
    println(positiveNegativeZeroCheck(0))
}

fun positiveNegativeZeroCheck(number:Int):String{
    var result = ""

    if(number > 0){
        result = "positive"
    }else if(number < 0){
        result = "negative"
    }else{
        result = "zero"
    }
    return result
}