@file:JvmName("DefaultKotlinFunction")

package DefaultFunction

fun main() {

    println(findVolume(1,1))//
    println(findVolume(1,1,1))// it overides the default value

}

@JvmOverloads // makes default function compatible with java
fun findVolume(lenght: Int, breadth: Int, height: Int = 10): Int {

    return lenght * breadth * height;
}
