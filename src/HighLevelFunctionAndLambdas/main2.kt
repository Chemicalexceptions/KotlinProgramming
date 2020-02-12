package HighLevelFunctionAndLambdas

/*
* Using 'it'
* Using with
* Using apply
*
* */

fun main() {

   val p = Power()
   p.reverseString("hello"){it.reversed()}

    //normal way

    p.age = 12
    p.name = "Mayank"

    //using with

    with(p){

        age = 23
        name = "Ankit"
    }

    //using Appply

    p.apply {

        age = 13
        name = "Pawan"

    }.startRun()

    println("Age is ${p.age} Name is ${p.name}")


}


class Power{

    var name =""
    var age=-1

    fun reverseString(str:String,reverseString :(String)->String){

        var result = reverseString(str)
        println(result)

    }

    fun startRun(){

        println("hey")
    }

}