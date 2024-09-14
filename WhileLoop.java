//while loops over and over again if condition is True

public class WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
//do will execute at least once even if false, then loop
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 0);
//example: countdown
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("End!");
//example: dice with if else
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println(dice);
            } else {
                System.out.println("Bingo!");
            }
            dice = dice + 1;
        }
    }
}
