//class method is method declared within a class
//*this part is 1st file

public class MethodStatPub {
//static method can be accessed without creating object

    static void statMethod() {
        System.out.println("called without object");
    }
//public method can only be accessed by object

    public void pubMethod() {
        System.out.println("must create object to call");
    }
//create method with parameter

    public void paraMethod(int param) {
        System.out.println("Number " + param);
    }

    /* dot. is used to access object's attributes & methods
parenthesis() is used to call method
class must have matching filename (Main & Main.java) */
//*this part is 2nd file
    public static void main(String[] args) {
        statMethod();
        MethodStatPub obj = new MethodStatPub();
        obj.pubMethod();
        obj.paraMethod(2);
    }
}
//using multiple class is a good practice (1st file with method in Main class, then accessed by object in 2nd file with main method)
//after compile files, just run the 2nd file
