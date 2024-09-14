
public class Main3 {

    public static void main(String[] args) {
        char myVar = '$', myVar2 = 123, myVar3 = 126;
        System.out.println(myVar);
        System.out.println(myVar2);
        System.out.println(myVar3);
        int quantity = 3;
        float price = 1.20f;
        float totalP = (quantity * price);
        String unit = "RM";
        char money = '$';
        System.out.printf("%s%.2f%n", unit, totalP);
        System.out.printf("Pay %.2f%c%n", totalP, money);
    }
}
