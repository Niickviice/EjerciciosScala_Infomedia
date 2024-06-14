
import  scala.io.Source
import scala.util.{Try, Failure, Success}
object ejercicio141 {


  def showlines(path:String): Unit={
    val archivo1 = Try(Source.fromFile(path))

    archivo1 match{
      case Success(source) => try{
        val linea = source.getLines().take(10)
          linea.foreach(println)
      } finally {
        source.close()
      }
      case Failure(exception) => println(s"Error no se puede leer el archivo $archivo1 ${exception.getMessage}")
    }
  }
  def main(args:Array[String]): Unit={
    if(args.length !=1){
      println("El encabezado del archivo")
    }else{
      val ruta = "C:\\Users\\CONSULTOR\\IdeaProjects\\alan\\src\\koala"
      val fullpath = ruta + args(0)
      showlines(fullpath)
    }
  }
}
