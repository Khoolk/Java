//Java Packages & API is used to group related classes, like a folder
//Packages is used avoid name conflicts, and to write better maintainable code
//2 categories: Built-in Packages (Java API), User-defined Packages (create own)

//Java API is a library of prewritten classes, can import
//whole package - import.package.name.*;
//a single class - import.package.name.Class;
//java.util is a package
//Scanner class get user input
import java.util.Scanner;

class ImClass {

    public static void main(String[] args) {
//create class object to use methods available
//nextLine() method is used to read a complete line
        Scanner obj = new Scanner(System.in);
        System.out.println("Type below");
        String text = obj.nextLine();
        System.out.println("You typed: " + text);
    }
}
