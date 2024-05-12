package com.hfad.studypractice.assignments

//write program that sorts elements in a list
fun main(){
    val myNumList = mutableListOf(1,3,6,57,2,500,37)
    myNumList.sortBy { it }

    println(myNumList)
}