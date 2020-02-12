package CollectionFramework

fun main() {

    //imutable list fixed and read only
    var list2 = listOf<String>("1","2","3")

    //mutabel lists
    //mutable list and read and write
    var list = mutableListOf<String>("1","2","3")
    list.add("2")

    for (i in list){

        println(i)
    }

//    for(index in 0..list.size-1){
//
//        println(list[index])
//    }

}

