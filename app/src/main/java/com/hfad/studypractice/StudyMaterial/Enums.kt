package com.hfad.studypractice.StudyMaterial


//Enums: a class that holds a fixed set of values
enum class Color{
    BLUE, RED, ORANGE
}


fun main(){
    var color = Color.BLUE

    getDescription(Color.BLUE)
}
fun getDescription(color:Color){
    when(color){
        Color.BLUE -> println("Its very cold")
        Color.RED -> println("Its very hot")
        Color.ORANGE -> println("Its mild")
        else->""
    }
}