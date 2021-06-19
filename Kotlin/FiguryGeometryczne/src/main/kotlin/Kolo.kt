class Kolo(val r: Double):Figura2D() {
    val pi = 3.14159265359

    override fun nazwa(): String {
        return "koło"
    }

    override fun obliczPole(): Double {
        return pi * (r*r)
    }

    override fun obliczObwod(): Double {
        return 2*r*pi
    }
}