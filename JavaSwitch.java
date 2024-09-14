//switch

public class JavaSwitch {

    public static void main(String[] args) {
        String x = "Tomato";
        switch (x) {
            case "Tomato":
                System.out.println("red");
                break;
            case "Cucumber":
                System.out.println("green");
                break;
        }
//break when match found, reduce execution time
        int y = 3;
        switch (y) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            default:
                System.out.println("Three or more");
        }
//default when no match found
    }
}
