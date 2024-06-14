object ejercicio173 extends App{

  println("Ingresa el texto que quieras")
  val input = scala.io.StdIn.readLine()

  def encode(x:String): Unit={
    val frase = x.toList.length
    //Convertimos la palabra en una lista
    val lista = x.toList
    //Si no hay elementos se manda un anuncio que no hay texto
    if(frase == 0) {
      println("No hay texto")
    }
    //Usamos la función foldLeft la cual recibe dos parámetros para recorrer la lista y contar los elemtnos de la lista
    val nuevo = lista.foldLeft(List.empty[(Char, Int)]){
      case (acc, elemento) =>
        acc match {
          //Cuando la lista este vacía, es decir cuando va a empezar el programa se agrega el primer elemento con su contador
          case  Nil =>
            List((elemento, 1))
            //Proseguimos a comparar el elemento actual con el último de la lista acumulada
          case (ultimo, contador) :: tail =>
            //Si los elementos son iguales incrementamos el contador
            if (elemento == ultimo) {
              (elemento, contador+1) :: tail
            }else{
              // Si son diferentes agregamos el nuevo elemento con el contador en 1 a la lista
              (elemento, 1):: acc
            }
        }

    }
    //Imprimimos la lista
    println(nuevo)

    //Para darle mayor presentación husamos un foreach para imprimir la letra y las veces que se repite en nuestro string
    nuevo.foreach{
      case (elemento, contador) => println(s"La letra $elemento se repite $contador veces")
    }

  }

  encode(input)

}
