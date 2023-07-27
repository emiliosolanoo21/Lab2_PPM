/*
Guatemala, julio 26 de 2023
Universidad del Valle de Guatemala
Programacion de plataformas moviles, seccion 10
Emilio Jose Solano Orozco, carne 21212

Lab. 2
PerfilUsuario.kt
 */
class PerfilUsuario (var ID: Int, var nombres: String, var apellidos: String, var urlPhoto: String?,
                     var edad: Int, var correo: String, var biografia: String?,
                     var estado: Estado = Estado.activo, val hobbies: MutableList<Hobby> = mutableListOf()){
    
}

enum class Estado{
    activo,
    pendiente,
    inactivo
}

class Hobby(var titulo: String, var descripcion:String, var urlPhoto: String?){
}