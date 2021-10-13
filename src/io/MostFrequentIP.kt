package io
import java.io.File

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String,Int>()
    File("src/ips.txt").forEachLine {
        /*
        if (ipToCount.contains(it)) {
            val previous = ipToCount.get(it)!! //!! convert to int a nulllable variable
            ipToCount.put(it, previous + 1)
        } else {
            ipToCount.put(it, 1)
        }
        */
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous +1)
    }

    println(ipToCount)
    val (maxIp, maxCount) = ipToCount.entries.maxByOrNull { it.value }!!
    println("Most frequent IP address is $maxIp, which ocurred $maxCount times.")


}