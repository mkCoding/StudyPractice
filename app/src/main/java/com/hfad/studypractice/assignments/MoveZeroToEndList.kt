package com.hfad.studypractice.assignments

//write a program that moves zero to the end of th list
fun main(){

    var myList = mutableListOf(0,40, 474, 3,3,0,3,1)
    var newList:MutableList<Int> = mutableListOf()

    var zeroCount = 0
    for(x in myList){
        if(x == 0){
            zeroCount++
        }else{
            newList.add(x)
        }
    }

    for(i in 1..zeroCount){
        newList.add(0)
    }
    println(newList)

}