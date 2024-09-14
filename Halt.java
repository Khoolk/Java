//halting condition used to stop function calling itself, preventing infinite recursion

public class Halt {

    public static void main(String[] args) {
        int x = sum(1, 5);
        System.out.println(x);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
