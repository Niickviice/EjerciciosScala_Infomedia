
object ejercicio104 {
  def main(args: Array[String]): Unit={
    //Creamo una lista mutable par almacenar nuestros números
    import scala.collection.mutable.ListBuffer
    val lista = ListBuffer[String] ()
    //Agregamos una variable para que sea nuestra bandera en nuestro bucle while
    var continue = true

    //Agregamos los números en la lista
    while(continue){
      println("Ingresa un elemento que desees agregar a la lista o puedes escribir el numero '0', para terminar")
      val elemento = scala.io.StdIn.readLine()
    //Cuando el usuario escriba 0 se dentendrá el bucle y mostrará la lista ordenada
      if(elemento == "0"){
        continue = false
      }else{
        //Aquí vamos agregando al final de la lista cada elemento
        lista += elemento
        println(s"Se agregó el número $elemento a la lista")

      }

    }
//Por último ordenamos la lista con la función sorted para imprimir la lista ordenada posteriormente
    val listaOrdenada = lista.sorted
    println("La lista ordenada es la siguiente",listaOrdenada)
  }

}
