//nest inner loop in a outer loop

public class NestedLoop {

    public static void main(String[] args) {
        for (int outer = 1; outer < 3; outer++) {
            System.out.println("Outer" + outer);
            for (int inner = 1; inner < 4; inner++) {
                System.out.println(" Inner" + inner);
            }
        }
    }
}
