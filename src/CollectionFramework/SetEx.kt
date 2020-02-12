package CollectionFramework

fun main() {

    //"Set" contains unique elements
    //"Hashset" also contains unique elements but sequence is not guranted

    //var mySet = setOf<Int>(2,54,3,1,0,9,9,9,8) //mutable read only
   // var mySet = mutableSetOf<Int>(2,54,3,1,0,9,9,9,8) //imutable read amd write both
    var mySet = hashSetOf<Int>(2,54,3,1,0,9,9,9,8) //imutable read amd write both
    mySet.remove(54)
    mySet.add(45)


    for (i in mySet){

        println(i)

    }


}