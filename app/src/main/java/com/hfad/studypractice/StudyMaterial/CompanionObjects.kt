package com.hfad.studypractice.StudyMaterial


interface Dream{
    fun workHard()
    fun study()
    fun getInShape()
    fun stopPartying()
}

class A {
    companion object:Dream{
        fun testMessage(){
            println("This is a test message")
        }

        override fun workHard() {
            TODO("Not yet implemented")
        }

        override fun study() {
            TODO("Not yet implemented")
        }

        override fun getInShape() {
            TODO("Not yet implemented")
        }

        override fun stopPartying() {
            TODO("Not yet implemented")
        }


    }

}

//Companion extension function
fun A.Companion.printSomething(){
    println("Hello")
}


fun main() {
    println(A.printSomething())

}

