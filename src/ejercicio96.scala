object ejercicio96  {
  //Creamos la función que definirá si el password es bueno o no

  def detector(pass:String):Boolean ={
    //Primero checamos su longitud
    if(pass.length < 8) return false

    //Para checar que al menos tiene una letra mayúsucla
    val mayuscula = pass.exists(_.isUpper)
    //Para checar que al menos tiene una letra minuscula
    val minuscula = pass.exists(_.isLower)
    //Para checar que al menos tiene un número
    val numero = pass.exists(_.isDigit)

    //Regresamos true si todas las condiciones son correctas}
    //con el operador && evaluamos cada variable, si una no es correcta se detiene.
    mayuscula && minuscula && numero
  }

  def main (args: Array[String]): Unit ={
    // El usuario ingresa el password
    println("Ingresa tu password para verificarlo")
    val contra = scala.io.StdIn.readLine()

    //Procedemos a la verificación
    if(detector(contra)){
      //Si todas las condiciones son verdaderas imprime este mensaje
      println("La contraseña es buena")
    }else{
      //  En caso de no cumplir con todas las condiciones el mensaje que arroja es el siguiente
      println("La contraseña no es buena")
    }

  }

}
