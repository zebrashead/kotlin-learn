fun main () {
 val x = 'c'
    for (i in '0'..'9') {
        print(i)
    }
    println()
    println(a() && b()) //lazy conjunction

    val arr = arrayOf(1, 2, 3)

    val myArr = IntArray(10) {it * it}
    for (i in myArr) {
        println(i)
    }

    val s = "abc"
//    for (ch in s) {
//        println(ch)
//    }
    s.forEach { println(it) }

    val str: String? = null
    println(str + 1)
    val arr1 = arrayOf(1) + arrayOf(2)
    println(arr1)

}

fun check (c: Char) {
//    if (c == 1) {
//
//    }
}

fun a(): Boolean {
    println('a')
    return false
}

fun b(): Boolean {
    println('b')
    return true
}