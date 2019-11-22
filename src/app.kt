fun main(){
    println("Esto es una app")
    var ratonSorpresa = Mouse ("ay")
    println(ratonSorpresa.tipo)
    var miComp = Computer(CPU("i5",5),Mouse("Blue"))
    miComp.cpu.memory=4000
    //Se creo objeto llamado miComputadora y se muestra bvariables con objeto tanto de CPU, como el tipo de ratón
    var miComputadora = Computer(CPU("i5", 5), Mouse())
    println(miComputadora.cpu);
    println("${miComputadora.cpu} tiene un ratón ${miComputadora.mouse.tipo}")
    println(miComputadora.toString())
    //Se crea objetos de Ratón y se muestra con una variable de objeto del tipo
    var ratonA = Mouse()
    println(ratonA.tipo)
    var ratonB = Mouse("inalámbrico")
    println(ratonB.tipo)
    ratonA.tipo = "bluetooth"
    println(ratonA.tipo)
}
//Esto es un ejercicio de Kotlin basado en ExampleComputer procedente de Java