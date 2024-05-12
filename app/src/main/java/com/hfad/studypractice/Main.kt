package com.hfad.studypractice

import java.time.LocalDateTime
import kotlin.concurrent.thread

sealed class Status(val statusMessage:String){
    class success:Status("Successful")
    class inProgress:Status("Progress")
    class failure:Status("Failed")
}

fun main() {

    val list = listOf(Status.failure(), Status.inProgress(), Status.success())
    list.forEach { println(it.statusMessage) }

}



