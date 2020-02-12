package CreateClass



fun main() {




    var customer = Customer("Mayank",2)
    customer.name = "Ankit"
    customer.id = 10

    println(customer.id)


}

class Customer(var name : String){
    //Body
   // var name : String ="dummy"

    var id :Int = -1

    init {
        println("Customer name is ${name} ${id}")
    }

    //secoundary constructir
    constructor(n:String ,id :Int): this(n){
        this.id = id;
    }
}