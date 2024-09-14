//method with if else

public class Methodifelse {

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
