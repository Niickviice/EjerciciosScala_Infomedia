object ejercicio15 extends App{

  println("Ingrese la cantidad de pies que quiere convertir")
  val pie = scala.io.StdIn.readInt()

  def pulgada(x:Int): Int = x*12
  def yardas(x:Int): Double = x/3
  def milla(x:Int): Double = x/5280

  println("Pie a pulgada da como resultado: ",pulgada(pie))
  println("Pie a Yarda da como resultado: ",yardas(pie))
  println("Pie a Milla da como resultado: ",milla(pie))

}
