package com.hfad.studypractice.assignments

//write program that removes duplicates from a list
fun main(){
    var myList = mutableListOf(1,2,3,4,55,6,7,8,9,30,9)
    val mySet = mutableSetOf<Int>()

    //this is to count the number of each element in list
    var elementCount = 0

    for(i in 0..myList.size-1){
        mySet.add(myList.get(i))
    }
    println(mySet)

}