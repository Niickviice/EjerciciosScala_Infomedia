object ejercicio10 extends App{
  println("Escribe los numeros para realizar la suma, la resta y la multiplicación")
  println("Escribe el numero A")
  val numeroA = scala.io.StdIn.readInt()
  println("Escribe el numero B")
  val numeroB = scala.io.StdIn.readInt()


  def suma(a: Int, b: Int): Int = a+b
  def resta(a: Int, b: Int): Int = a-b
  def multi(a: Int, b: Int): Int = a*b
  def div(a: Int, b: Int): Int = a/b
  def cociente(a: Int, b:Int):Int= a%b
  def logdiez(a:Int):Double = scala.math.log10(a)
  def potencia(a: Double, b: Double): Double = scala.math.pow(a, b)

  println("La suma da como resultado: ",suma(numeroA,numeroB))
  println("La resta da como resultado: ",resta(numeroA,numeroB))
  println("La multiplicación da como resultado: ",multi(numeroA,numeroB))
  println("El cociente cuando a se divide por b da como resultado: ",div(numeroA,numeroB))
  println("El resto cunado a es dividido por b da como resultado: ", cociente(numeroA,numeroB))
  println("El log 10 de a da como resultado: ",logdiez(numeroA))
  println("La potencia de a elevada a b  da como resultado: ", potencia(numeroA,numeroB))


}
