package Recursion

import java.math.BigInteger

// 0 1 1 2 3 5 8 .....
//


fun main() {


     var num = getFibonacciNumber(100000, BigInteger("1"), BigInteger("0"))

    println(num)
}

tailrec fun getFibonacciNumber(n :Int , a:BigInteger ,b: BigInteger): BigInteger{

    if(n==0){

        return b
    }
    else{

        return getFibonacciNumber(n-1,a+b,a)
    }

}


