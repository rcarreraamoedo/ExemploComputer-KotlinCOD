data class Mouse (
    var tipo: String = "usb"){
    init {
        println("Iniciando...")
        tipo = tipo + "!"
    }
}