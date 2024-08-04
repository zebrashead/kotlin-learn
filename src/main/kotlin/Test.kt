fun main(args: Array<String>) {
//    println(args.contentToString())
    println("Entry any word: ")
    //val yourWord = readln()
    //print("You word is $yourWord")

    println(sum(3, 5))
    println(sum(1, 2))
    printSum(3, 4)
    println(incX())
    println(maxOf(3, 5))

    val myList = listOf("banana", "apple", "b")
    for (index in myList.indices) {
        println("$index index equal value ${myList[index]}")
    }
    println(describe("Hello"))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

val PI = 3.14
var x = 0

fun incX(): Int {
    x += 1
    return x
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        !is String -> "Not a string"
        else -> "Unknow"
    }





