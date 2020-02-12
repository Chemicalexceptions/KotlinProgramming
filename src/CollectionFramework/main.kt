package CollectionFramework

fun main() {

    //arrays tuts

    var myArray = Array<Int>(5){0} // mutable but fixed size
    myArray[0] = 32
    myArray[3] = 54

    //println(myArray[3])

    //foreach
//    for( i in myArray){
//
//        println(i)
//    }

    //for
    for( i in 0..myArray.size-1){

        println(myArray[i])
    }


}