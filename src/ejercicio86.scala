object ejercicio86 {

  val cancion = List(
    "a Partridge in a Pear Tree.",
    "two turtle doves,",
    "three French Hens,",
    "four calling birds,",
    "five gold rings,",
    "six geese a laying,",
    "seven swan a swimming,",
    "eight maids a milking,",
    "nine ladies dancing,",
    "ten lords a leaping,",
    "eleven pipers piping,",
    "twelve drummers drumming,"

  )

  //Lista de números ordinales

  val ordinales = List(
    "first", "second", "third", "fourth", "fifth", "sixth",
    "seventh", "eight", "ninth", "tenth", "eleventh", "twelfth"
  )

  //Función para mostrar un verso específico

  def verso(dia: Int): Unit = {
    //Vamos haciendo una impresion al recorrer la lista
    println(s"On the ${ordinales(dia-1)} day of Christmas, my true love gave me:")

    for(x <- dia to 1 by -1){
      if(x == 1 && dia >1) {
        println("and " + cancion(x-1))
      } else{
        println(cancion(x-1))
      }
  }
println()
}

  def main(args: Array[String]): Unit ={
    //Para mostrar los 12 versos hacemos el bucle con la función de la construcción de cada uno
    for(dia <- 1 to 12){
      verso(dia)
    }
  }


}
