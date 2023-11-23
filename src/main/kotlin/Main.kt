import Clases.*

fun main() {
    /*val viajeMonterrey = Nacional( "Monterrey")//El city lo pone por defecto Kootlin
    viajeMonterrey.quotePrice( 4)
    viajeMonterrey.reserve(4)
    val viajeMonterreyconDescuento = NationalLowSeason("Monterrey")
    viajeMonterreyconDescuento.reserve(4)*/

    //declaración el objeto
    //val scaryMovie = Movie("Scary Movie", "Comedia", 88.27)
    //Impresión
    //println(scaryMovie.name)

    /*DESTRUCUTRADO: Se obtiene información del objeto*/
    /*scaryMovie.createdAt = "2000"
    println(scaryMovie.component1())
    val(name2, gender2, duration2) = scaryMovie
    println("Nuevas variables: $name2, $gender2, $duration2")*/

//De lo anterior para omitir un dato que no requiera:
    //val(_, gender3, duration3) = scaryMovie

    //Para copiar y al mismo tiempo modificar la información de un objeto se realiza:
    //val scaryMovie2 = scaryMovie.copy(name = "Scary Movie 2", duration = 83.0)
    //println(""" Primer nombre de película: $scaryMovie
       // |       Segundo nombre de película: $scaryMovie2 """.trimMargin())

    //val vehicleInstance = Vehicle.create() //Ya no se llama al objeto sino a un método
    //var saludo = {println("Hola BEDU")}() //Se indica de forma más directa lo que se desea hacer.

    //val suma = {a: Int, b: Int -> a+b} //Cuando se envían tipos de datos y se reuiere regresar un resultado con tipo de dato distinto
    //println(suma(4, 5))

    //val presentarse: (String, Int) -> String = {name, age -> "Me llamo $name y tengo $age años"}
    //println(presentarse("Javier", 29))

    /*val serverGrade: (Double, Double) -> String = { expected, saved -> val percentage = saved/expected

    when {
        percentage > 1 -> "Ahorrador pro"
        percentage == 1.0 -> "Buen ahorrador"
        percentage < 1.0 && percentage >= 0.8 -> "Almost"
        else -> "Aprendiz saver"

    }
    }
    println(serverGrade(100.0,120.0))*/

    //Función anónima. (la función no tiene nombre)

    val serverGrade2 = fun(expected: Double, saved: Double): String{
        val percentage = saved / expected
        return when{
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(serverGrade2(100.0,120.0))

    //Lo siguiente es una función que permite recibir tanto los datos que necesita como la misma expresón lamda

    fun sumaOrdenSuperior(a: Int, b: Int, suma: (Int, Int) -> Int): Int {

        return suma(a,b)
    }
    }

   // println(sumaOrdenSuperior(8, 7, suma))
