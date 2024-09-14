//array store multiple elements in a single variable, can access by index number

public class Arrays {

    public static void main(String[] args) {
        String[] alph = {"a", "b", "c"};
        int[] num = {1, 2, 3};
        System.out.println(alph[0]);
        System.out.println(num[0]);
//change element in array
        num[2] = 5;
        System.out.println(num[2]);
//length of an array
        System.out.println(alph.length);
    }
}
