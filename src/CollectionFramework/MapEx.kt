package CollectionFramework

fun main() {

    //mutable

    var myMap = HashMap<Int,String>()
    //var myMap: MutableMap<Int, String> = mutableMapOf<Int,String>()
   // var myMap = hashMapOf<Int,String>()
    myMap.put(4,"Ankit")
    myMap.put(5,"Mayank")
    myMap.put(6,"Akash")

    myMap.replace(6,"Modi")


    //immutable ,Fixed size ,Read only
//    var myMap = mapOf<Int,String>(
//
//        2 to "yogi",
//        3 to "manmohan",
//        7 to "ok"
//    )


    for (key in myMap.keys){

        println(myMap[key])// mymap.get(key)
    }



}