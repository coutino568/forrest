import com.sun.org.apache.xpath.internal.functions.FuncFalse

public class ForrestGump(val MyBox: BoxOfChocolates){

    //var MyBox = BoxOfChocolates()

    fun pickChocolate():Chocolate? {
        println(MyBox)
        if (MyBox.isBoxEmpy() == false) {
            var selectedChocolate = MyBox.extract()
            return selectedChocolate
        } else {
            println("Life sucks")
            return null
        }

    }
}