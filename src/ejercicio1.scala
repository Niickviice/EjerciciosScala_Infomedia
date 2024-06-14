object ejercicio1 {
  def main(args: Array[String]): Unit = {
    println("¿Cuál es tu nombre?")
    val nombre= scala.io.StdIn.readLine()
    println(s"Hola $nombre, !Bienvenid@!")
  }
}