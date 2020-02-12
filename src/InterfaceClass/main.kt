package InterfaceClass


interface OnClickListener{

    var btnLogin :String //properties of interface are abstract by default

    //normal are public and open and not final
    fun onClick(){

        println("OnClick Called")

    }

    fun onTouch()

}


class Button : OnClickListener{

    override var btnLogin: String ="ankit"

    override fun onTouch() {

        println("OnTouch Called")

    }

    override fun onClick() {
        super.onClick()
    }
}


fun main() {

    var btn = Button()
    btn.onClick()
    btn.onTouch()

}