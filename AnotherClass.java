//create another class (2nd file) with object in main method to access the method in MainClass (1st file)

class AnotherClass {

    public static void main(String[] args) {
        MainClass object = new MainClass();
        System.out.println(object.x);
    }
}
