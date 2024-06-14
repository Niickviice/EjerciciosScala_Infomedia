import java.security.Principal
import scala.collection.mutable.ListBuffer

object ejercicio131 {

  def mensaje[K, V](x: Array[String], dict: Map[K, V]): Unit = {
    val mensajer = ListBuffer[String]()

    for (i <- x) {
      for ((k, v) <- dict) {
        if (i == k) {
          mensajer += v.toString
        }
      }
    }

    println(mensajer)
  }

  def main(args: Array[String]): Unit = {
    val Dic_Morse = Map(
      ".-" -> "A",
      "-..." -> "B",
      "-.-." -> "C",
      "-.." -> "D",
      "." -> "E",
      "..-." -> "F",
      "--." -> "G",
      "...." -> "H",
      ".." -> "I",
      ".---" -> "J",
      "-.-" -> "K",
      ".-.." -> "L",
      "--" -> "M",
      "-." -> "N",
      "---" -> "O",
      ".--." -> "P",
      "--.-" -> "Q",
      ".-." -> "R",
      "..." -> "S",
      "-" -> "T",
      "..-" -> "U",
      "...-" -> "V",
      ".--" -> "W",
      "-..-" -> "X",
      "-.--" -> "Y",
      "--.." -> "Z",
      "-----" -> "0",
      ".----" -> "1",
      "..---" -> "2",
      "...--" -> "3",
      "....-" -> "4",
      "....." -> "5",
      "-...." -> "6",
      "--..." -> "7",
      "---.." -> "8",
      "----." -> "9"
    )

      import scala.collection.mutable.ListBuffer
      val lista = ListBuffer[String]()
      //Agregamos una variable para que sea nuestra bandera en nuestro bucle while
      var continue = true

      //Agregamos las palabras en la lista
      while (continue) {
        println("Ingresa clave por clave para imprimir tu mensaje, cuando termiones escribe 'salir")
        val elemento = scala.io.StdIn.readLine()
        //Cuando el usuario escriba salir se dentendrá el bucle y mostrará la lista ordenada
        if (elemento == "salir") {
          continue = false
        } else {
          //Aquí vamos agregando al final de la lista cada elemento
          lista += elemento
          println(s"Se agregó la clave $elemento")


        }
        println("aquí esta tu mensaje en clave morsa", lista)

      }
       mensaje(lista.toArray,Dic_Morse)

    }




}