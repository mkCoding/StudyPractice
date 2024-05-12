package com.hfad.studypractice.assignments

//reverse a string
fun main(){
    val myString = "Hello"
    var reverseString = ""

    //iterate through the sting in reverse order
    for(i in myString.length-1 downTo 0){
        //add every letter to reverseString in reverse order
        reverseString+=myString.get(i) //
    }

    //print out the reversed string
    println(reverseString)
}