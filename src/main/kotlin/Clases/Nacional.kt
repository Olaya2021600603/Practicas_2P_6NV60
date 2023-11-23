package Clases

open class Nacional( override val city: String): Travel() {//Toda clase padre lleva el open
    override val country = "Mexico" //Se tienen que sobreescribir los "protected val." de Travel

    protected val fees = mapOf( //El mapOf es como un diccionario: Contiene una llave y su respectivo valor
        "Monterrey" to 400, //Monterrey es la llave y trae su valor
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Crsitóbal de las Casas" to 240,
        "San Miguel de Allende" to 320
    )


    override fun quotePrice(numDays: Int){
        val price = getPrice(numDays)
        if(price == 0){
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        }
        else
        {
            println("Tu viaje a $city cuesta \$$price")
        }
    }

    override fun getPrice(numDays: Int): Int {
        val fee = fees[city]
        return if(fee==null) 0 else fee*numDays
    }
}