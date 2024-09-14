//break stops a switch statement such as loop

public class BreakContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
//continue skip the iteration if match, then continue

            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
//break & continue in while loop

        int x = 1;
        while (x < 6) {
            System.out.println(x);
            x++;
            if (x == 5) {
                break;
            }
            if (x == 3) {
                x++;
                continue;
            }
        }
    }
}
