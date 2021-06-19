class Rownologlobok(val a: Double, val b: Double, val h: Double):Figura2D()
{
    override fun nazwa(): String {
        return "Rownoległobok"
    }
    override fun obliczPole(): Double{
        return a*h
    }

    override fun obliczObwod(): Double {
        return 2*a + 2*b
    }
}