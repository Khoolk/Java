//boolean

public class JavaBoolean {

    public static void main(String[] args) {
        boolean correct = true;
        boolean wrong = false;
        System.out.println(correct + " and " + wrong);
//if, else if, else
        int x = 1, y = 2;
        System.out.println(x < y);
        System.out.println(x == y);
        if (x > y) {
            System.out.println("Normal");
        } else if (x == y) {
            System.out.println("Equal~");
        } else {
            System.out.println("Abnormal!");
        }
//Ternary Operator = (condition) ? True : False;
        String result = (x < y) ? "Normal" : "Abnormal!";
        System.out.println(result);
    }
}
