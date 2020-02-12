package ExtensionFunctions

//ExtensionFunctions can add custom functions in an alredy pre defined class in kotlin


fun main() {

    var student = Student()
    println("Pass Student : " + student.hasPassed(50))
    println("Add Student : " + student.add(50, 50))


    val firstname = "Ankit"
    val lastname = "Roy"

    var fullname = firstname.makeFullName(firstname,lastname)
    println(fullname)




}


fun String.makeFullName( firstname :String ,lastname :String): String{

    return  this + " ${lastname}"
}

fun Student.add(a: Int, b: Int): Int {

    return a * b;
}

class Student { //Our Class

    fun hasPassed(marks: Int): Boolean {

        return marks > 40;

    }


}