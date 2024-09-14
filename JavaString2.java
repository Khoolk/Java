
public class JavaString2 {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String z = "3";
//integer is sum
        System.out.println(x + y);
//string is concatenate
        System.out.println(x + z);
//special character returned to string by backslash \
        String txt = "the \"backslash\", \', \\";
        System.out.println(txt);
//escape sequence: \n newline, \r return carriage, \t tab, \b backspace, \f form feed
        String txt2 = "ab\ncd\ref\tgh\bij\fkl";
        System.out.println(txt2);
    }
}
