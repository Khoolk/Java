//String

public class JavaString {

    public static void main(String[] args) {
        String word = "Sentence";
        System.out.println(word);
//string length
        System.out.println(word.length());
//upper & lower case
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
//find character in string and return its position (count from 0)
        String txt = "Find the text";
        System.out.println(txt.indexOf("text"));
//Concatenate
        System.out.println(word + " " + txt);
        System.out.println(word.concat(txt));
    }
}
