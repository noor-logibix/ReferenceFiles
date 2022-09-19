fun main() {
    var numbers: Array<Any> = arrayOf(1, 2, 3, 4, 5)
    numbers[2] = 10
    numbers = arrayOf(1, 2, 3, 4, "10")
    val elements: Array<Any> = arrayOf(1, 'c',Student("Shan", 112) , "Noor", 4, 5, Student("Subha", 111))
    val strings = arrayOf("Shan", "Noor")
    val str = "ABCD"

    for (element in numbers) {
        println(element)
    }

    for (element in elements) {
        println(element)
    }

    for (element in strings) {
        println(element)
    }

    for (element in str) {
        println(element)
    }
}

class Student(var name: String, var rollNo: Int) {
    override fun toString(): String {
        return "$name , $rollNo"
    }

}