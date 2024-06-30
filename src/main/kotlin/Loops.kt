fun main() {
    val items = listOf("apple", "banana", "orange") //неизменяемый список
    //mutableListOf("apple", "melon")

    for (item in items)
        println(item)

    //while
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    // Диапозоны
    println(5 in 3..10) //true

    for (i in 1..10)
        print(i)
    println()
    for (i in 1 until 10) {
        print(i)
    }

    println()
    for (i in 10 downTo 1) {
        print(i)
    }

    for (i in 0..100 step 10) {
        println(i)
    }
}