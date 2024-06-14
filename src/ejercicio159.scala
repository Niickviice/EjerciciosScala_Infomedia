
object ejercicio159 extends App{
  import java.io.File
  import scala.io.Source
  val path ="C:\\Users\\CONSULTOR\\IdeaProjects\\alan\\src\\hola.txt"

  val archivo = new File(path)
  val lista : List[String] = List()


  val contenido: Iterator[String] = Source.fromFile(archivo).getLines()
  val nuevo = contenido.toList

  def dupliado[T](list: List[T]):  Unit ={
    val check = list.distinct
    val conteo1 = list.size
    val conteo2 = check.size

    if(conteo1 == conteo2){
      println("El texto no tiene elementos duplicados")
      println(list.toString)
    }else{
      println("El texto tiene elementos duplicados")
      println(list.toString)
    }
  }

  dupliado(nuevo)






}
