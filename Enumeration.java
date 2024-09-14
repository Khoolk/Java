
//enumeration means "specific /complete list"
enum Level {
    LOW,
    MEDIUM,
    HIGH,
}

public class Enumeration {
//enum can also be inside a class

    enum EClass {
        EASY,
        HARD,
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        EClass obj = EClass.EASY;
        System.out.println(obj);
//enum often used in switch statement to check for corresponding values
        switch (myVar) {
            case LOW:
                System.out.println("low level");
                break;
            case MEDIUM:
                System.out.println("medium level");
                break;
            case HIGH:
                System.out.println("high level");
                break;
        }
//enum has value() method to return an array of (loop through) all constants
        for (Level myVal : Level.values()) {
            System.out.println(myVal);
        }
    }
}
