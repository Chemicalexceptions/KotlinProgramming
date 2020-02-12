package NamedParameter

fun main() {

    findVolume(lenght = 3,height = 4,breadth = 7) //named parameter
    findVolume(lenght = 3,breadth = 7) //named parameter

}

@JvmOverloads // makes default function compatible with java
fun findVolume(lenght: Int, breadth: Int, height: Int = 10): Unit {

    //return lenght * breadth * height;
    println("length is ${lenght}")
    println("breadth is ${breadth}")
    println("height is ${height}")

}
