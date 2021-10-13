fun main (args: Array<String>){
    var mode : Int = 2
    val result = when(mode) {
        1 -> "one"
        2 -> {
            "dos"
            "two"
        }
        3 -> "three"
        else -> "whatever"
    }
    print(result)
    val x = if (mode==2) {
        println("you chose mode 2")
        2
    } else {
        0
    }
    println(x)
}