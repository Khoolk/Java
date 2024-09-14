//block scope & method scope

public class BlockScope {

    public static void main(String[] args) {
//block start
        int x = 1;
//method start
        System.out.println(x);
//method end
//block end
    }
}
//block scope may exist on its own or belongs to if, while, for statement
