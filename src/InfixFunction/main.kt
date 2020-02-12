package InfixFunction

fun main() {

    var name = "Ankit"

    var fullname = name add name  //the new  way using infix prefix before method name
    println(fullname)
}


infix fun String.add(a:String):String{

    return this+a
}