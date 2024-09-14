//main class

public class Constructor {
//class attribute

    int x, y;
    String z;
//class contructor for main class, must match class name

    public Constructor() {
        x = 1; //value for class attribute
    }

    public Constructor(int num, String alp) {
        y = num;  //contructor also can take parameter
        z = alp;  //can have multiple parameters
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();  //create object of main class will call the contructor
        System.out.println(obj.x);
        Constructor obj2 = new Constructor(2, "A"); //parameter is passed to contructor when called
        System.out.println(obj2.y + obj2.z);
    }
}
//contructor is used to set initial values for object attributes
// all classes have contructor by default
