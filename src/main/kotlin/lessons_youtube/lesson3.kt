package lessons_youtube

fun main() {
    println(f())
    println(f1())
    println(myFunc())
}

fun f() = 1
fun f1():String {
    return "123"
}

val myFunc = fun ():String {
    return "this is my fun"
}