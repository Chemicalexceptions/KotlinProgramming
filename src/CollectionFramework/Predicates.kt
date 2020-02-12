package CollectionFramework

fun main() {

    val myNum = listOf<Int>(1,2,3,10,11,12)

    val myPredicate = {num:Int->num>10}

    var check1 =myNum.all(myPredicate) // check all elements greater then 10
    println(check1)
    println(myNum.any({it>10}))
    println(myNum.count({it>10}))
    println(myNum.find({it>10}))//returs the first number which matches the condition


}