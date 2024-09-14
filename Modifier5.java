//for attribute & method:
//final cannot be overridden / modified

public class Modifier5 {

    final String a = "fixed";
    final int b = 9;
//static belongs to the class, rather than an object, can be called without object

    static void statMet() {
        System.out.println("can be called without object");
    }
//public must be called by creating object

    public void pubMet() {
        System.out.println("must create object to call");
    }

    public static void main(String[] args) {
        statMet();
        Modifier5 obj = new Modifier5();
        obj.pubMet();
    }
}

//transient skips attribute & method when serializing object containing them
//synchronized method can only be accessed by one thread at a time
//volatile attribute value is not cached thread-locally, and is always read from "main memory"
