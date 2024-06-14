object ejercicio128 {

  def main (args: Array[String]): Unit ={
    val diccionario1 = Map("pikachu" -> 15, "Charizard" -> 3, "Bulbasour" -> 1, "Lapras" ->3)

       def reverseLookup(diccionario: Map[String,Int]): Unit ={
         val resultado = diccionario.keySet
         print(resultado)
       }
    val look = reverseLookup(diccionario1)
    println(look)

  }
}
