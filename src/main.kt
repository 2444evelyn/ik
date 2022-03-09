fun main(){
    namesOfgirls(arrayOf("Pree","Amah","Lily","Meena"))


    namesOftowns(arrayOf("harare","mumbai","dodoma","jakarta"))
    numbers(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    println(namesOfarray().contentToString())

}

fun numbers(number:Array<Int>) {
    var answers = number[2] + number[5]
    println(answers)

    var add = number.indexOf(158)
    println(add)

    var sum = number.sortedArray()
    println(sum.contentToString()
    )
}

fun namesOfgirls( name: Array<String>){
    println(name.contentToString())

}
fun namesOftowns(cities:Array<String>){
    cities.forEach { cities ->
        println(cities.capitalize())

    }

}
fun namesOfarray():Array<String>{
    var num = arrayOf("chair","door","locker",)
    return num
}

