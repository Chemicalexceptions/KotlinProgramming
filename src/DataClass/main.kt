package DataClass

fun main() {

    var user1 = User("ankit",23)
    var user2 = User("ankit",23)
   // var user2 = User("mayank",24)


    if(user1==user2){ //with data class use now user1 becomes user1.toString() so they compare and give value

        println("Equal")

    }

    else{
        //without data class
        //because object create refrence varaiable in the have different location so == checks refrence
        // variable so the location are different so not equals comes.

        println("Not Equals")
    }

    var newUser = user1.copy(name = "Peter")

    println("new user ${newUser}")


}

data class User(var name :String, var age : Int)

