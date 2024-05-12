package com.hfad.studypractice.assignments

//check if number is prime or not
fun main(){

    println(isPrime(16))

}

//check if number is only visible by 1 and itself only
fun isPrime(number:Int):String{

 //loop through all numbers from 2 to number (passed in)
    for(i in 2 until number){
        //if there is any number between [2 - number passed in] that is divisible by number then number is not prime
        if(number % i == 0){
            //not prime
            return "Is not a prime number"
        }
    }

    return "Is a prime number"

}