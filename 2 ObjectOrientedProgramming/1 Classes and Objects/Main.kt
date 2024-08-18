fun main() {
    val box1 = Box()
    val box2 = Box()
    val box3 = Box()

    println("Height: ${box1.height}")
    println("Length: ${box1.length}")
    println("Width: ${box1.width}")

    box1.boxOpen()
    box1.fillContents()
}