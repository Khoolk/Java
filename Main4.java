
public class Main4 {

    public static void main(String[] args) {
        int myInt = 8;
        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble);
        float myFloat = 9.99f;
        System.out.println(myFloat);
        int myNar = (int) myFloat;
        System.out.println(myNar);
        int max = 62, score = 55;
        float percent = (float) score / max * 100.0f;
        System.out.printf("%.2f%c%n", percent, '%');
    }
}
