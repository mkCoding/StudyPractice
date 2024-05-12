package com.hfad.studypractice.assignments

//Write a program that determines if a number is even or odd
fun main(){

    evenOddCheck(20)
}

fun evenOddCheck(x:Int){
    if (x % 2 == 0){
        //even
        println("$x is even")
    }else if (x % 2 !=0){
        //odd
        println("$x is odd")
    }
}