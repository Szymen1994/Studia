class SzesciokatForemny(val a: Double, val h: Double) :Figura2D() {
    override fun nazwa(): String {
        return "Sześciokąt foremny"
    }
        override fun obliczPole(): Double {
            return 6*(a*h)
        }
        override fun obliczObwod(): Double {
            return 6*a
        }
}


