abstract class Figura2D {
    abstract fun nazwa():String
    abstract fun obliczPole():Double
    abstract fun obliczObwod():Double

    fun info(){
        println("${nazwa()}")
        println("Pole powierzchni wynosi: ${obliczPole()}")
        println("Obwod figury wynosi: ${obliczObwod()}")
    }
}
