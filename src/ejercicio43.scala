object ejercicio43 extends App{
  print("Escribe la cantidad del billete que quieres obtener, debe ser 1,2,5,10,20,50 ó 100")
  val numero = scala.io.StdIn.readInt()

  def buscador(x:Int)= {
    val billetes = scala.collection.Map(1->"George Washington" , 2 -> "Thomas Jefferson", 5 -> "Abraham Lincoln",10 ->"Alexander Hamilton",
      20 -> "Andrew Jackson",50 -> "Ulysses S. Grant",  100 ->"Benjamin Franklin")
    val cantidad = billetes.get(x)
    println(s"el billete de la cantidad ${x} tiene como personaje a", cantidad)
}

}