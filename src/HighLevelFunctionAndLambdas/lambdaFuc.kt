package HighLevelFunctionAndLambdas

fun main() {

    var myLamda: (Int, Int) -> Unit = { a: Int, b: Int -> println(a + b) }
   // var myLamda: (Int, Int) -> Unit = { a, b -> println(a + b) }

    Test().add(2, 4, myLamda)
    Test().add(2, 4, { a, b -> println(a + b) })//or same as above
    Test().add(2, 4){ a, b -> println(a + b) }// or same as above
}

class Test {


    fun add(a: Int, b: Int, action: (Int, Int) -> Unit) {

        //high level functions with lamda as parameter
        action(a, b)
    }


}