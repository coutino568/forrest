
fun main(args: Array<String>) {


        var chocolates=arrayListOf<Chocolate>(
            Chocolate(1,"Hershey"),
            Chocolate(2, "Toblerone")

    )

    var Tom = ForrestGump(BoxOfChocolates(chocolates))

   // var cajita= BoxOfChoclates()
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