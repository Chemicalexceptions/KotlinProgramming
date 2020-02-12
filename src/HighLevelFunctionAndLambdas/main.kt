package HighLevelFunctionAndLambdas

fun main() {


    val program = Program()
   // program.add(2,3)
    program.add(2,3,object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val myLamba :(Int) -> Unit = {s:Int -> println(s)} //lambda function
    //lambda function
    program.add(2,3,myLamba)
    program.add(2,3,{s:Int -> println(s)})
}


class Program{


    fun add(a :Int ,b :Int,action :(Int)->Unit){//high level functions with lamda as parameter

        action(a+b)
    }


    fun add(a :Int ,b :Int , action :MyInterface){

        action.execute(a+b)

    }

    fun add(a :Int ,b :Int){

        println(a+b)
    }

}

interface MyInterface{

    fun execute(sum :Int)
}

