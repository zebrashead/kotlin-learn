package lessons_youtube

//fun main() {
//    val a = 100
//    val aBoxed: Int = a
//    val aBoxed2: Int = a
//    println(aBoxed === aBoxed2)
//
//}

//fun main() {
//    println(10 % 3)
//    val result: Float = (23 / 8).toFloat()
//    println(result)
//}

fun main() {
//    print(23 / 8f)
    val result: Float = (5/2).toFloat()
    val result1 = (5 / 2.0)

    println(result)
    println(result1)

    val result2 = -5.0 / 0
    println(result2 == Double.NEGATIVE_INFINITY)

    println(Double.NEGATIVE_INFINITY / Double.POSITIVE_INFINITY)
}
