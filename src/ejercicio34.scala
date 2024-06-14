object ejercicio34 extends App {

  print("Escribe el numero entero y te diré si es par o impar" )
  val numero = scala.io.StdIn.readInt()

    def impar_par(x:Int): Unit = {
      if(x%2==0){
      println(s"El numero ${x} es par")}
      else{
        println(s"El nuero ${x} es impar")
      }
    }

  impar_par(numero)

    }

