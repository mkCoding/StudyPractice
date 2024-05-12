package com.hfad.studypractice.assignments

//write program that checks element frequency
fun main() {
    val myList = mutableListOf("a", "b", "c", "c", "z", "p", "q", "r", "r")
    checkElementFrequency(myList)
}

fun checkElementFrequency(myList: MutableList<String>) {
    var myMap = mutableMapOf<String,Int>()
    var count = 0

    for(x in myList){
        //if element is not in map add it
        if(!myMap.containsKey(x)){
            count = 1
            myMap.put(x,count)
        }
        //if element is in the map only increase the count of that particular value associated with that key
        else {
            count++
            myMap.put(x, count)
        }


    }

    println(myMap)
}