object ejercicio164 extends App {

  import scala.collection.mutable.ListBuffer

  val lista = ListBuffer[String]()
  //Agregamos una variable para que sea nuestra bandera en nuestro bucle while
  var continue = true

  //Agregamos las palabras en la lista
  while (continue) {
    println("Ingresa clave por clave para imprimir tu mensaje, cuando termines solo teclea la barra de espacio ' ")
    val elemento = scala.io.StdIn.readLine()
    //Cuando el usuario escriba salir se dentendrá el bucle y mostrará la lista ordenada
    if (elemento == " ") {
      continue = false
      val pollito = lista.size
      println("total de elemtnos ingresados = ",pollito)
    } else {
      //Aquí vamos agregando al final de la lista cada elemento
      lista += elemento

      println(s"Se agregó la clave $elemento")

    }

  }
}

