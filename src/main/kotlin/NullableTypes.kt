fun main() {
    var a: String = "Hello"
    // a = null // NPE исключены

    var b: String? = "Test"
    b = null

    //b.length

    //safe call
    //Вернет длину b, если null вернет null
    b?.length


    //Elvis - ?:
    var c: String? = "Hello"
    c = null
    val res = c?.length ?: -1
    println(res)

    b = if ((0..10).random() > 5) "asd" else null
    //!! - выбрасывает NPE если в переменной null
    val t = b!!.length

}