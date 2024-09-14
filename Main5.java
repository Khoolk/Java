//Arithmetic operator +-*/

public class Main5 {
//Assignment operators =

    public static void main(String[] args) {
        int x = 5 % 2;
        ++x;
        System.out.println(x);
        // % modulus shows remainder, ++ is increment by 1, -- is decrement by 1
        int y = --x;
        System.out.println(y);
        // x += 3 is x+3
        int z = 2;
        z += 3;
        System.out.println(z);
//Bitwise operator & |
        int a = 3 & 2;
        System.out.println(a);
        int b = 3 | 2;
        System.out.println(b);
//Shift operator >> <<
        int c = 3 >> 2;
        System.out.println(c);
        int d = 3 << 2;
        System.out.println(d);
    }
}
