package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 42))
    val namesToAges2 = mapOf("Peter" to 24, "Roger" to 42)

    println( namesToAges == namesToAges2) // True
    println(namesToAges.keys) // [Peter, Roger]
    println(namesToAges.values) // [24, 42]
    println(namesToAges.entries) // [Peter=24, Roger=42]

    val countryToInhabitants = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000
    )

    println(countryToInhabitants.contains("Austria")) // false
    println(countryToInhabitants.containsKey("France")) // false
    println(countryToInhabitants.containsValue(80_000_000)) // true

    println(countryToInhabitants.get("Germany")) //80000000
    println(countryToInhabitants.getOrDefault("France", 0)) // 0

    namesToAges.entries.forEach{
        println("${it.key} is ${it.value} years old")
    }
    //Peter is 24 years old
    //Roger is 42 years old

}