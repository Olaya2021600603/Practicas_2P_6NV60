//Las data class nos permite ver más información a partir de un objeto en una sola impresión de pantalla
// La data clase permite crear variables a partir de ella misma

data class Movie (val name: String, val gender: String, val duration: Double)
{

    var createdAt = "" //Como se declara la variable guardará el dato como string
    //Cuado se declara la variable en el cuerpo de la clase el "component" no lo toma como "argumento" de la clase
}