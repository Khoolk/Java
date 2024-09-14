//Access Modifier control access level
//for Class: public class is accessible by any other class

public class Modifier {
//for Attributes, Methods, Constructors: public code is accessible for all classes

    public String alp = "x";
//private code is only accessible within declared class
    private String alp2 = "y";
//default code is only accessible in same package
    String alp3 = "z";

    public static void main(String[] args) {
        Modifier obj = new Modifier();
        System.out.println(obj.alp2);
        System.out.println(obj.alp3);
    }
}

//Non-Access Modifier provides other functionality
