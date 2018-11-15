import java.util.*

public class BoxOfChocolates(var chocolates: ArrayList<Chocolate> ) {
//    var chocolates =arrayListOf<Chocolate>(
//            Chocolate(1,"Hershey"),
//            Chocolate(2, "Toblerone")
//
//    )

    fun isBoxEmpy():Boolean{
        return chocolates.isEmpty()

    }
    //for
    // return buffer.removeAt(Random().nextInt(bufer,size)}
    fun extract():Chocolate{
       // var random position=math.random

        return chocolates.removeAt(Random().nextInt(chocolates.size))}
    }

