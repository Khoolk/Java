//Polymorphism have many related classes by inheritance
//use the method to perform different tasks (allows performing single action in different ways)

class Inherit2 {

    public void met() {
        System.out.println("The action");
    }
}

class Action1 extends Inherit2 {

    public void met() {
        System.out.println("Punch");
    }
}

class Action2 extends Inherit2 {

    public void met() {
        System.out.println("Kick");
    }
}

class Polymorph {

    public static void main(String[] args) {
        Inherit2 obj = new Inherit2();
        Inherit2 obj2 = new Action1();
        Inherit2 obj3 = new Action2();
        obj.met();
        obj2.met();
        obj3.met();
    }
}
