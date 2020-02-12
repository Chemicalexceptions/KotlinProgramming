@file:JvmName("MyCustomKotlinFile")

package JavaToKotlin

//caling java function form kotlin
fun main() {

    println("from_kotlin-> "+CallJava.getArea(2,3))

}

fun add(a: Int, b: Int) :Int {

   return a+b;

}