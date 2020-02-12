import model.Person

fun main(args: Array<String>) {

   // forLoop()
    //breakStatment()
   // continueStatment()
    //switchUsingWhen()




}

fun breakStatment(){

    myloop@ for(i in 1..3){

        for(j in 1..3){

            println("$i $j")
            if(i==2 && j==2){
                break@myloop
            }

        }

    }

}



fun continueStatment(){

     for(i in 1..3){

        if(i%2 == 0){
          continue
        }

        println(i)


    }

}

fun StringInterPolarity(){

    val name = "Ankit"
    //name = "Mayank"

    println(name)

}

fun DoubleDotOperator(){

    //double dot operator
    val r1 = 1..5 step 2
    // print(r1)

    val r2 = 5 downTo 1 step 2

    val r3 = 1..5

    var r4 = 'a'..'z'
    var isPresnt = 'a' in r4 //present or not

    var countDown = 10.downTo(1)
    var moveUp = 1.rangeTo(10)

}

fun forLoop(){

    for (i in 1..4){

//        println("hello")
//        println(i)

        if(i%2==0){

            println(i)
        }

    }

}


fun whileLoop(){

    var i = 0

    while(i<5){

        println("hello world")
        i++

    }

}

fun doWhileLoop(){

    var i = 0

    do{

        println("hello world")
        i++

    }

    while(i<5)
}


fun switchUsingWhen(){


    val x= 3

    when(x){

        1-> print("x is ${x}")
        2-> print("x is ${x}")

        //for multiple condition

        0,2 -> print("x is 0 or 2")

        //usong range

        in 1..20 -> println ("x lies in 1 to 20")


        //for default we use else

        else -> {

            println("Number is unknown")
            println("Number is unknown 2")

        }


    }

}

fun ifElse(){

    //if statement

    var a = 5
    var b = 10

    var maxValue: Int

    if (a > b) {

        maxValue = a
    } else {

        maxValue = b

    }

    // print(maxValue)


    var maxValue2: Int = if (a > b) {
        a
    } else {
        b
    }

    print("${maxValue2} secound")

}
