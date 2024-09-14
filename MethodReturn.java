//use method to return value such as int, char...

public class MethodReturn {

    static int method(int x) {
        return 1 + x;
    }
//two parameter

    static int method2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(method(2));
        System.out.println(method2(2, 3));
//store result in a variable
        int z = method2(4, 5);
        System.out.println(z);
    }
}
