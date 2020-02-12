package Inheritance

fun main() {

    var dog = Dog()
    dog.eat()
    println(dog.color)

    var cat = Cat()
    //cat.eat()


}


 open class Animal{

   open var color : String = "Yellow"

   open fun eat(){

        println("Animal Eat")
    }


}

class Dog : Animal(){

    var breed : String = ""
    override var color : String = "Blue"

    fun bark(){

        println("Bark")
    }

    override fun eat() {
        super<Animal>.eat()
        println("Dog is Eat")
    }
}


class Cat :Animal(){

    var age : Int = -1

    fun mewo(){

        println("Bark")
    }

}