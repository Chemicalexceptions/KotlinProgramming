package CollectionFramework

fun main() {

    val myNum = listOf<Int>(1,2,3,10,11)
    val mySmallNums = myNum.filter { s-> s<10}

    for(i in mySmallNums){
       // println(i)
    }

    val mySquareNums= myNum.map {it*it}



    val myNumSquaredList = myNum.filter {s->s<10}.map {it*it}


    var people = listOf<Person>(
        Person(10,"Ankit"),
        Person(25,"Mayank"),
        Person(45,"Saurab")
    )

    var names = people.filter {it.name.startsWith("A")}.map {it.name}
    for(i in names){
        println(i)
    }


}


class Person(var age:Int,var name :String){



}