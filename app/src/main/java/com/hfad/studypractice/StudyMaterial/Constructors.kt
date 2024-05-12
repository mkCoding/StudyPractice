package com.hfad.studypractice.StudyMaterial

class Person{

    lateinit var firstname: String
    lateinit var lastname: String

    //primary constructor
    constructor(firstname:String, lastname:String){
        this.firstname = firstname
        this.lastname = lastname

        println("Calling from primary constructor")
    }

    //secondary constructor
    constructor(firstname:String){
        //add logic
        println("Calling from secondary constructor")
    }

    constructor(){
        println("Calling from empty constructor")
    }
}

fun main(){
    val constructor1 = Person("Max","Overtime")
    val constructor2 = Person("Jessica")
    val constructor3 = Person()



    //    var listOfCars = mutableListOf<Car>(
//        Car("Royal Blue","Kia","Optima"),
//        Car("Grey","Ford","Explorer"),
//        Car("Black","Dodge","Ram"),
//        Car("Yellow","Dodge Charger","Charger"),
//        Car("Orange","Tesla","Model Y"),
//        Car("Green","Ford","Soul")
//    )
//
//    println(listOfCars[0].fullCarDetails)
}