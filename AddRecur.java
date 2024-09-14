//recursion make a function call itself, halting condition (x < 0) stops it

public class AddRecur {

    public static void main(String[] args) {
        int i = sum(5);
        System.out.println(i);
    }

    public static int sum(int x) {
        if (x > 0) {
            return x + sum(x - 1);
        } else {
            return 0;
        }
    }
}
