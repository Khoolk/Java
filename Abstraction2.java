//interface cannot be used to create object
//interface method do not have body, the body is privided by implements class (must override all methods)
//interface methods are by default abstract & public
//interface attributes are by default public, static & final
//interface cannot contain constructor (cannot create object)
//hide certain details & show only important details of an object for security

interface Interf1 {

    public void sound();

    public void sleep();
}
//subclass can only inherit from 1 superclass (cannot have multiple inheritance)
//but a class can implements multiple interfaces, separate by comma(,)

interface MultiInterf {

    public void otherMet();
}

class Person implements Interf1, MultiInterf {

    public void sound() {
        System.out.println("Haha");
    }

    public void sleep() {
        System.out.println("zzz");
    }

    public void otherMet() {
        System.out.println("multi inheritance");
    }
}

class Abstraction2 {

    public static void main(String[] args) {
        Person ind = new Person();
        ind.sound();
        ind.sleep();
        ind.otherMet();
    }
}
