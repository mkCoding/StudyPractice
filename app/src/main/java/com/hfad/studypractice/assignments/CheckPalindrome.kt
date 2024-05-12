package com.hfad.studypractice.assignments

//check if a word is a palindrome (word spelled same way forwards and backwards)
fun main(){
    val initialText = "Was it a car or a cat I saw.".replace(Regex("[^a-zA-Z0-9\\s]"), "")
    val manipulatedWord = initialText.toLowerCase().replace(" ","") //make all letters lowercase and remove spaces
    var manipulatedWordReversed:String = ""

    //upTo is used for natural order
    //downTo is used for reversing
    for(i in manipulatedWord.length -1 downTo  0){
        manipulatedWordReversed+=manipulatedWord[i]
    }

    if(manipulatedWord == manipulatedWordReversed){
        println("The text is a palindrome")
    }else{
        println("This text is not a palindrome")
    }
}