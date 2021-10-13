package collections

fun main (args: Array<String>){

    var districts = arrayOf("Surco","Ventanilla","San Juan")
    val list = listOf("Orange", "Apple", "Banana")
    var arrayList =  arrayListOf("Frank", "William", "Bruce")
    arrayList.add("2pac")


    val name = "frank"
    println(name[0])
    val moreDistricts = arrayOf("VMT", "VES")
    districts += moreDistricts
    println(districts.size)

    println(moreDistricts.isEmpty())
    println(moreDistricts.contains("Lurigancho"))


    arrayList.remove("Bruce")
    println(arrayList)

    val subList = arrayList.subList(0,2)
    println(subList)


}