package ScopeFunctions

//╔══════════╦═════════════════╦═══════════════╦═══════════════╗
//║ Function ║ Receiver (this) ║ Argument (it) ║    Result     ║
//╠══════════╬═════════════════╬═══════════════╬═══════════════╣
//║ let      ║ this@MyClass    ║ String("...") ║ Int(42)       ║
//║ run      ║ String("...")   ║ N\A           ║ Int(42)       ║
//║ run*     ║ this@MyClass    ║ N\A           ║ Int(42)       ║
//║ with*    ║ String("...")   ║ N\A           ║ Int(42)       ║
//║ apply    ║ String("...")   ║ N\A           ║ String("...") ║
//║ also     ║ this@MyClass    ║ String("...") ║ String("...") ║
//╚══════════╩═════════════════╩═══════════════╩═══════════════╝

fun main() {


    // ScopeFunctions().test()

}


class ScopeFunctions {

    //global variable
    var property: String? = "42"

    fun someMethod() {

//        var copy = property
//
//        if (copy != null) {
//
//            print(copy.length) // Error
//        }



    }


//    fun test() {
//        val str: String = "Ankit"
//        val result = str.let {
//           // print(this) // Receiver
//            it
//            42 // Block return value
//          // print(it) // Argument
//
//        }
//
//       println(result)
//    }
}