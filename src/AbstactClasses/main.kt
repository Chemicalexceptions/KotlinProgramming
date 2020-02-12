package AbstactClasses


//All funtions are public by defualt

fun main() {

}


fun run(){


}

class TestClass {

    fun testing(){


//        var person = Person()
        //println(b)
    }
}

abstract class Person{

    public var a = 1;
    protected var b = 1;
    internal var c = 1;
    private var d = 1;

    var name = "my_name"
    abstract var absName: String
    // public final in nature by default
    fun goToSchool(){

    }


    open fun getHeight(){

    }


    abstract fun eat()//abstract methods are by default open in nature


}


class Indian : Person(){


    override var absName: String = "abs_ankit"

    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getHeight() {


    }

    fun test(){


    }



}