package com.hfad.studypractice.assignments

//write a program that finds the area and perimeter of a circle
fun main(){

    val radius = 40;

    println("The area of a circle with $radius is ${circleArea(radius)}")
    println("The Perimeter of a circle with $radius is ${circlePerimeter(radius)}")


}

//PI * radius^2
fun circleArea(radius:Int):Double{

    val area = Math.PI * radius.squared()
    return area
}

//2 * PI * radius
fun circlePerimeter(radius: Int):Double{

    val perimeter = 2 * Math.PI * radius
    return perimeter

}
 fun Int.squared():Int{
    return this * this

}
