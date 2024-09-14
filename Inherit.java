//subclass inherits attribute & method from superclass
//inheritance reuse attribute & method of existing class when creating new class
//protected modifier for same package & subclasses

class SuperClass {

    protected String att = "x";

    public void met() {
        System.out.println("call");
    }
}

class Inherit extends SuperClass {

    private String att2 = "y";

    public static void main(String[] args) {
        Inherit obj = new Inherit();
        obj.met();
        System.out.println(obj.att + " " + obj.att2);
    }
}
