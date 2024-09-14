//Abstraction hide certain details & show only essential details of object to user for security
//abstract class cannot be used to create object, must be inherited from another class
//abstract method can only be used in abstract class, no body, as the body is provided by subclass (inherit)

abstract class Abstraction {

    public abstract void sound();

    public void sleep() {
        System.out.println("zzz");
    }
}

class Person extends Abstraction {

    public void sound() {
        System.out.println("Haha");
    }
}

class Abstra2 {

    public static void main(String[] args) {
        Person ind = new Person();
        ind.sound();
        ind.sleep();
    }
}
