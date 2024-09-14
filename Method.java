//Java provide pre-defined methods, but own method can also be created, also called function
//name of method()
//static means method belongs to class & not an object of the class
//void means method do not have a return value

public class Method {

    static void Function() {
        System.out.println("action");
    }

    public static void main(String[] args) {
        Function();
//method can be called multiple times
        Function();
    }
}
