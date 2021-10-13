package loops

fun main (args: Array<String>){
    for (i in 1..10){
        for (j in 1..10){
            if (i-j == 5) {
                break
            }
            println("${i} - ${j}")
        }
    }
    println("**")
    outer@for (i in 1..10){
        for (j in 1..10){
            if (i-j == 5) {
                break@outer
            }
            println("${i} - ${j}")
        }
    }
}