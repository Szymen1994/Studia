class Kwadrat(val a: Double): Figura2D() {
    override fun nazwa(): String {
        return "Kwadrat"
    }
    override fun obliczPole(): Double {
        return a*a
    }

    override fun obliczObwod(): Double {
        return 4*a
    }
}
