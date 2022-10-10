package animal

open class Animal() {
    var weight: Int? = null
    var age: Int? = null

    fun eat() {
        println("The animal is eating...")
    }

    open fun move() {
        println("The animal is moving...")
    }
}
