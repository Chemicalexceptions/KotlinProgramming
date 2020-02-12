package Singleton


//object
object ApiURL {

    var BASE_URL = "http://144.48.78.35/ezeefile_saas_returns/api/"
    var LOGIN = BASE_URL + "index.php"

}

fun main() {

    println(ApiURL.LOGIN)
    println(MyClass.LOGIN)
    println(MyClass.getLoginUrl())

}


class MyClass {

    companion object ApiUrl {

        var BASE_URL = "http://144.48.78.35/ezeefile_saas_returns/api/"
        var LOGIN = BASE_URL + "index.php"

        @JvmStatic
        fun getLoginUrl(): String {
            return LOGIN

        }

    }

}