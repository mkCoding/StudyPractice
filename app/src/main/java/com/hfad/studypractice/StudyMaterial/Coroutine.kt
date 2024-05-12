package com.hfad.studypractice.StudyMaterial

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


//Start, End, Hello, Goodbye, World, Universe
fun main() {
    println("Start")

    GlobalScope.launch {
        println("Coroutine 1: Hello")
        delay(500)
        println("Coroutine 1: World")
    }

    GlobalScope.launch {
        println("Coroutine 2: Goodbye")
        delay(500)
        println("Coroutine 2: Universe")
    }

    println("End")
    Thread.sleep(2000)
}