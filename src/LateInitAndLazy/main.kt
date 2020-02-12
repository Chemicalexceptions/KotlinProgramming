package LateInitAndLazy

val pi : Float by lazy { 3.14f }  //using lazy for memory optimisizing

fun main(){

    val country = Country()
    country.name = "hey"
    println(country.name)
    country.setup()


}

class Country{

    lateinit var name :String

    fun setup(){
        name = "USA"
        println("The name of the country is ${name}")

    }

}