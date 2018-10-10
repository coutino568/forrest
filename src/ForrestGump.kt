import com.sun.org.apache.xpath.internal.functions.FuncFalse

public class ForrestGump{

    var MyBox = BoxOfChoclates()

    fun pickChocolate():Chocolate? {
        if (MyBox.isBoxEmpy() == false) {
            var selectedChocolate = MyBox.extract()
            return selectedChocolate
        } else return null

    }
}