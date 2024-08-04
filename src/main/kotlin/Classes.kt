open class Shape {
    val PI = 3.14
}

class Rectangle(val height: Double, val width: Double): Shape() {
    val perimeter = (height + width) * 2
}

fun main() {
    val rectangle = Rectangle(4.0, 5.0)
    println(rectangle.PI)
    println(rectangle.perimeter)
}