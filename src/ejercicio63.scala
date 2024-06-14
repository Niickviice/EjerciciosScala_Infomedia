object ejercicio63  {

  //Hacemos el bucle For para hacer la conversión de 0 a 100
  println("A continuacuión se presenta la conversión de celsius a Farennheit")

  def main(args: Array[String]): Unit = {
//Hacemos una función donde se hace la conversión de Celsius a Farenheit
    def cefa(ce:Int): Double ={
      (ce * 1.8 ) + 32
    }
//Hacemos el bucle para obtener la conversión de grados Celcius  Farenheit en un bulce for de 0 a 100
    for(cel <- 0 to 100){
      //Aplicamos la funci+on de conversión
      val faren = cefa(cel)
      //Imprimimos cada valor haciendo incapié en la conversión °C = °F
      println(f"$cel%3d °C = $faren%6.2f °F")
    }
  }


}
