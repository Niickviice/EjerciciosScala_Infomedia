object ejercicio72 {

  def main(args: Array[String]): Unit = {
    println("Ingresa tu palabra y te diré si es o no un palindormo")
    //Leemos la palabra ingresada por el usuario
    val pal = scala.io.StdIn.readLine()
    // Esta función verifica si una palabra es palindormo, regresa true o false
    def palindormo( x:String): Boolean = {
      x == x.reverse
    }
    // Imprimos según sea True o false aplicando la función con la palabra del usuaario
    if(palindormo(pal)){
      println(s"$pal es un palíndromo")
    } else{
      println(s"$pal no es un palíndromo")
    }
  }
}
