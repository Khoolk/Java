//Encapsulation for better attribute & method control
//class attribute can be made read only (get), or write only (set)
//programmer can flexibly change one part without affecting other code
//increase data security

public class Encapsul2 {

    public static void main(String[] args) {
        Encapsul obj = new Encapsul();
        obj.setName("John");
        System.out.println(obj.getName());
    }
}
