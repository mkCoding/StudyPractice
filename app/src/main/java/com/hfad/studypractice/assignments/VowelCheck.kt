package com.hfad.studypractice.assignments

fun main(){
    println(vowelCheck("b"))
}

fun vowelCheck(letter: String):String{
    when(letter){
        "a" -> return "Is a vowel"
        "e" -> return "Is a vowel"
        "i" -> return "Is a vowel"
        "o" -> return "Is a vowel"
        "u" -> return "Is a vowel"
        else-> return "Is a consonant"

    }
}