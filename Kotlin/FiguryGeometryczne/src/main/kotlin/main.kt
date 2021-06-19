fun main() {

    val listaFigur = mutableListOf<Figura2D>()

    val kwadrat1 = Kwadrat(2.0)
    val prostokat = Prostokat(2.0,5.0)

    listaFigur.add(kwadrat1)
    listaFigur.add(prostokat)
    listaFigur.add(Kwadrat(2.0))
    listaFigur.add(Trapez(8.0, 4.0 ,3.0, 2.0, 3.0))
    listaFigur.add(Rownologlobok(3.0, 2.0, 4.0))
    listaFigur.add(SzesciokatForemny(4.0, 2.0 ))
    listaFigur.add(Kolo(4.0))

    for(figura in listaFigur) {
        println("-------------------")
        figura.info()
    }

    val figura = znajdzNajmniejszePole(listaFigur)
    println("------------------------")
    println("Najmniejsze znalezione pole: ${figura.obliczPole()}")

    val najwiekszaFigura = znajdzNajwiekszePole(listaFigur)
    println("Najwieksze znalezione pole: ${najwiekszaFigura.obliczPole()}")
}

fun znajdzNajmniejszePole(listaFigur: MutableList<Figura2D>):Figura2D{
    var figuraTymczasowa = listaFigur[0]

    for(figura in listaFigur){
        if(figura.obliczPole()<figuraTymczasowa.obliczPole())
            figuraTymczasowa = figura
    }

    return figuraTymczasowa
}

fun znajdzNajwiekszePole(listaFigur: MutableList<Figura2D>):Figura2D{
    var figuraTymczasowa = listaFigur[0]

    for(figura in listaFigur){
        if(figura.obliczPole()>figuraTymczasowa.obliczPole())
            figuraTymczasowa = figura
    }

    return figuraTymczasowa
}
