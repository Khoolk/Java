//parameter is variable in method

public class MethodParam {

    static void method1(String paramet) {
        System.out.println("execute " + paramet);
    }

//argument is passed to method
    public static void main(String[] args) {
        method1("argument");
        method1("arg2");
    }
}
