//Scanner class is used to get user input, create object to use methods available:

import java.util.Scanner;

class InputNext {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type below:");
//nextLine method read Strings
        String userName = myObj.nextLine();
        double userDouble = myObj.nextDouble();
        float userFloat = myObj.nextFloat();
        int userInt = myObj.nextInt();
//      boolean userBoolean = myObj.nextBoolean();
//      byte userByte = myObj.nextByte();
//      long userLong = myObj.nextLong();
//      short userShort = myObj.nextShort();
        System.out.println("You typed: \n" + userName + "\n" + userDouble + "\n" + userFloat + "\n" + userInt);
    }
}
