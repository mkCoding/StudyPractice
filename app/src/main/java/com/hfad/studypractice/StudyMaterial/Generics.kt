package com.hfad.studypractice.StudyMaterial

fun main() {
    val myStringList = listOf("dog", "dinosaur", "car", "people")
    val myNumberList = listOf(1,3,6,7,8,9,5,334,9)

    printAll(myStringList) //printAll takes a list containing any type of elements
    printAll(myNumberList)

    testGenericInput("h")

}


fun <T> printAll (myList: List<T>){

    if(!myList.isNullOrEmpty()) {
        for (item in myList) {
            println(item)
        }
    }
}

fun <T> testGenericInput(a:T){
    var isALetter = false
    var isANumber = false



    if(a as? Int == null){
        isANumber = false
    }else if(a as? Int != null){
        isANumber = true
    }

    when(isANumber)
    {
        true-> println("This is a number")
        false -> println("This is a letter")
    }

}
