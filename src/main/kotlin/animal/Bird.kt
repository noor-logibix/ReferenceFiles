package animal

open class Bird : Animal() {
    var wingsCount: Int? = null
    override fun move() {
        println("They can fly")
    }

    open fun tweet(){
        println("The bird is tweeting...")
    }
}