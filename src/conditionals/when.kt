package conditionals

fun main (args: Array<String>){

    val x : Int= 10
    when (x){
        5 -> println("five")
        3*3 -> println("nine")
        in 5..10 -> println("between 1 an 10")
        !in 8..20 -> println("not between 8 and 20")
    }
}