//final class cannot be inherited by other class

final class FClass {

    public void contruct() {
        System.out.println("Tadaa");
    }
}
//abstract class cannot be used to create object, it must be inherited from another class to be accessed

abstract class Modifier4 {
//abstract method can only be used in abstract class and on method without body run()

    public abstract void inherit();
}
//abstract method body is provided by subclass

class AClass extends Modifier4 {

    public int x = 8;

    public void inherit() {
        System.out.println("inherited");
    }
}
//another class to create object for abstract class, then call the abstract method

class Inheri {

    public static void main(String[] args) {
        AClass obj = new AClass();
        System.out.println(obj.x);
        obj.inherit();
    }
}
