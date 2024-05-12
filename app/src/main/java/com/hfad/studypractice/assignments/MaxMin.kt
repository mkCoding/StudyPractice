package com.hfad.studypractice.assignments

//find max and min of 3 numbers
fun main(){

    findMaxMin(40,9,3000)
}

fun findMaxMin(x:Int, y:Int, z:Int){

    var max = maxOf(x, y, z)
    var min = minOf(x,y,z)

    println("Max: $max Min: $min")


}