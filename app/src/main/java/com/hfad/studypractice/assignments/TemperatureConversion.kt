package com.hfad.studypractice.assignments

//write program to convert temperature from celsius to fahrenheit and vice versa
fun main(){

    val celsiusTemp = 20
    val fahrenheitTemp = 100

    println(convertToCelsius(fahrenheitTemp))
    println(convertToFahrenheit(celsiusTemp))
}

fun convertToCelsius(fahrenheitTemp: Int): String {    //formula C = 5/9 * (F + 32)
    val convertedToCelsius = (5.0 / 9.0) * (fahrenheitTemp + 32 ) //double
    return "$convertedToCelsius °C"
}

fun convertToFahrenheit(celsiusTemp: Int): String {

    //formula F = 5/9 * C * 32
    //convert to F
    val convertedToFahrenheit = (celsiusTemp * 9.0 / 5.0) + 32 //double
    return "$convertedToFahrenheit °F"


}