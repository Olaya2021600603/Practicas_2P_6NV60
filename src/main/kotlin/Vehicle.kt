class Vehicle {
    init
    {
        println("Vehículo creado")
    }
    companion object Factory //Ya no declaramos el objeto en el main sino en la misma clase.
    {
        fun create(): Vehicle = Vehicle()
    }
}