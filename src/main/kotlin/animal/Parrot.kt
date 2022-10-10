package animal

class Parrot : Bird() {
    override fun move() {
        super.move()
        println("The parrot is flying...")
    }
}