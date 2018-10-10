import java.util.*

public class BoxOfChoclates {
    var chocolates :ArrayList<Chocolate> =ArrayList();

    fun isBoxEmpy():Boolean{
        if (chocolates.size==0){
            return true
        }else {return true}

    }
    // return buffer.removeAt(Random().nextInt(bufer,size)}
    fun extract():Chocolate{
       // var random position=math.random

        return chocolates.removeAt(Random().nextInt(chocolates.size))}
    }

