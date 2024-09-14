//attribute = variable = field in a class
//a class can have multiple attributes

public class AttClass {

    int x = 1;
//final modifier makes the variable always keep the same value
    final int y = 2;
//access attribute in class by creating an object of the class and using . syntax

    public static void main(String[] args) {
        AttClass obj = new AttClass();
        AttClass obj2 = new AttClass();
//override attribute
        obj.x = 3;
        System.out.println(obj.x);
        System.out.println(obj.y);
//a class can have multiple object, an attribute change of an object will not affect the other
        System.out.println(obj2.x);
    }
}
