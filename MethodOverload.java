//method overloading use same name for multiple methods as long as number and/or type of parameters are different

public class MethodOverload {

    static int method(int x, int y) {
        return x + y;
    }

//different type of parameter
    static double method(double x, double y) {
        return x + y;
    }

//different number of parameter
    static int method(int a) {
        return a;
    }

    public static void main(String[] args) {
        int num = method(1, 2);
        double num2 = method(1.1, 2.22);
        int num3 = method(8);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }
}
