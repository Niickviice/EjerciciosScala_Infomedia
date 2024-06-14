object ejercicio27 extends App{

  println("Si las unidades son en libras escribe l, si son en kilo escribe k")
  val unidad = scala.io.StdIn.readLine()

  if(unidad == "l"){
    println("Escribe primero tu altura en pulgadas")
    val altura = scala.io.StdIn.readInt()
    println("Escribe tu peso en libras")
    val peso = scala.io.StdIn.readInt()

    def BMI_libra(x:Int, y:Int):Double = ((y*y)/x)*703

    println("Tu Indice de Masa Corporal en libras es:",BMI_libra(altura,peso))

  } else if (unidad == "k"){
    println("Escribe primero tu  en centimetros")
    val altura = scala.io.StdIn.readInt()
    println("Escribe tu peso kilogramos")
    val peso = scala.io.StdIn.readInt()
    def BMI_kilo(x:Int, y:Int): Double = y*y/x
    println("Tu Indice de Masa Corporal en kilogramo es",BMI_kilo(altura,peso))
  }
}
