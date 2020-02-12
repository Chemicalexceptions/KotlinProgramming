package NullSafe

fun main() {

    var response : String? = null

    response?.let {

       println(" Let block")

    }?:run {

       println(" run block")
   }






    var name: String? = null //? means the string can be null

    //safe call (?.)

   // println("The length of the string is ${name?.length}")

    //safe call with let (?.let)
    name?.let {
        println(" 2 The length of the string is ${name.length}")
    }

    //elvis operator(?:)
    val len = if (name != null) {
        name.length
    }
    else{
        -1
    }

    //
    val length = name?.length?:-1
    println(length)

    //non -null assetion operator (!!)
    //it will give u null pointer exception if null
    //make sure u r 200% sure that it doesn't conatin null value
   // println(" 2 The length of the string is ${name!!.length}")


}