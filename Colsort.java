//Collections class has sort() method for sorting list in ascending order

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Colsort {

    public static void main(String[] args) {
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(9);
        myNumber.add(3);
        myNumber.add(5);

        Collections.sort(myNumber);
        for (int i : myNumber) {
            System.out.println(i);
        }

        LinkedList<String> myText = new LinkedList<String>();
        myText.add("GG");
        myText.add("ZZ");
        myText.add("BB");
//reverseOrder() method to sort in descending order
        Collections.sort(myText, Collections.reverseOrder());
        for (String x : myText) {
            System.out.println(x);
        }
    }
}
