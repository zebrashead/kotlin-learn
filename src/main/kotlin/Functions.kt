fun main() {
    println(testSimple())
    println(testSimple1(1, 2))
    println(testString2(10))

    println(testNamedArguments(y = 4, z = 2, x = 5))

    testDefaultArguments(3)
    testDefaultArguments()
    testDefaultArguments(y = 5)

    println(foo("igor", toUpperCase = true))

    printEven(1,2,3,4,5,6)
    printEven(*intArrayOf(1,2,3,4,5), 6, 7, 8)

}

fun testSimple(): Int = 5 + 5 //если нужен только return

fun testSimple1(x: Int, y: Int): Int = x + y //тип возвращаемоего значения можно не указывать

fun testString2(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    if (toUpperCase) {
        return name.uppercase() + number
    } else {
        return name + number
    }
}

//varargs + operator *

fun printEven(vararg numbers: Int) {

    numbers.forEach {
        e -> if (e % 2 == 0) println(e)
    }
}