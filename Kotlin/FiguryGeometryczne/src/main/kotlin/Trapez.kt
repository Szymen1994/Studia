class Trapez (val a: Double, val b: Double, val c: Double, val d: Double, val h: Double):Figura2D()
{
    override fun nazwa(): String {
        return "Trapez"
    }

    override fun obliczPole(): Double {
        return ((a+b)*h)/2
    }

    override fun obliczObwod(): Double {
        return a+b+c+d
    }
}