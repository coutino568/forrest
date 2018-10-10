
fun main(args: Array<String>) {
    var Tom = ForrestGump()
    var continuar: Boolean =true
    var opcion=""
    while (continuar== true){
        println("1)Agarrar un chocolate \n2)Salir\n")
        opcion= readLine().toString()
        if (opcion=="1"){
            println(Tom.pickChocolate())
        }
        if (opcion=="2"){
            println("**Fin**")
            continuar=false
        }

    }
}