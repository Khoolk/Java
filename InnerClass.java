//inner class nest a class within a class, to group classes that belong together for more readable & maintainable code

class OuterClass {

    int x = 1;

    class InnerClass {

        int y = 2;
//inner class can access attribute & method of outer class

        public int InnerMet() {
            return x;
        }
    }
//private inner class cannot be accessed by outside object

    private class InnerP {

        int z = 3;
    }
//static inner class can be accessed without creating object of outer class

    static class InnerS {

        int a = 0;
    }
}

public class InnerClass {

    public static void main(String[] args) {
        OuterClass objO = new OuterClass();
        OuterClass.InnerClass objI = objO.new InnerClass();
        System.out.println(objO.x + " " + objI.y);
        OuterClass.InnerS objS = new OuterClass.InnerS();
        System.out.println(objS.a);
        System.out.println(objI.InnerMet());
    }
}
//static inner class does not have access to members of outer class
