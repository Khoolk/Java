//protected code is accessible in the same package & subclasses

class SubClass {

    protected String alp4 = "i";
}

class Modifier3 extends SubClass {

    private int num = 1;

    public static void main(String[] args) {
        Modifier3 obj = new Modifier3();
        System.out.println(obj.num);
        System.out.println(obj.alp4);
    }
}
