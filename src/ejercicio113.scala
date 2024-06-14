object ejercicio113 {

  //Creamo la función que le dará formato a la impresión de la lista, para agregarle el and al final y las comas entre los elementos
  def formato(x: List[String]): String = {
    //El match es para reonocer patrones, si coincide
    x match {
      //Nil es el null en la lista pues imprime nada
      case Nil =>""
      // Divide una lista en su primer elemento   y arroja el primer elemento
      case head :: Nil => head
      //En caso de detectar que esta el primero y el segundo imprimimos los elemtos con con el "and" entre ambos
      case head :: second :: Nil => s"$head and $second"
      case _ =>
        //Con la función init regresamos todos los elementos menos el último
        val total = x.init
        //Con la función .last regresamo el último valor de la lista
        val ultimo = x.last
        //Con la función mkString se regresa todos los elementos de una lista con un separador, en este caso ','
        // y le agregamos al final del String el 'and' junto con el último elemento de la lista
        total.mkString(",") + s" and $ultimo"


    }
  }

  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ListBuffer
    val lista = ListBuffer[String]()
    //Agregamos una variable para que sea nuestra bandera en nuestro bucle while
    var continue = true

    //Agregamos las palabras en la lista
    while (continue) {
      println("Ingresa un elemento que desees agregar a la lista o puedes escribir el numero 'salir', para terminar")
      val elemento = scala.io.StdIn.readLine()
      //Cuando el usuario escriba salir se dentendrá el bucle y mostrará la lista ordenada
      if (elemento == "salir") {
        continue = false
      } else {
        //Aquí vamos agregando al final de la lista cada elemento
        lista += elemento
        println(s"Se agregó la palabra $elemento a la lista")

      }


    }
    val resultado = formato(lista.toList)
    println(resultado)


  }



}
