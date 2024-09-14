
public class JavaMath {

    public static void main(String[] args) {
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-1));
        System.out.println(Math.random());
//random number within 0-100
        int rdm = (int) (Math.random() * 101);
        System.out.println(rdm);
    }
}
