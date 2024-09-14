//ArrayList class is a resizable array (size of an array cannot be modified)

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {

    public static void main(String[] args) {
//element in ArrayList is object, specify the wrapper class, type String
        ArrayList<String> slist = new ArrayList<String>();
//add() method add element to the list
        slist.add("Bb");
        slist.add("Aa");
        slist.add("Cc");
//add item at specified position by referring to index number
        slist.add(0, "Dd");
//get() method access element with index number
        System.out.println(slist.get(1));
//set() method modify an element
        slist.set(2, "Changed");
//remove() method remove an element
        slist.remove(3);
        System.out.println(slist);
//size() method count elements in ArrayList
        slist.size();
//for loop
        System.out.println("For Loop:");
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
        }
//for-each loop
        System.out.println("For-each Loop:");
        for (String x : slist) {
            System.out.println(x);
        }
//sort()
        Collections.sort(slist);
        System.out.println("Sorted:");
        System.out.println(slist);
//clear() method remove all elements in ArrayList
        slist.clear();
        System.out.println("Cleared:");
        System.out.println(slist);
//primitive type: Integer, Boolean, Character, Double
        ArrayList<Integer> ilist = new ArrayList<Integer>();
        ilist.add(3);
        System.out.println(ilist);
        ArrayList<Boolean> blist = new ArrayList<Boolean>();
        ArrayList<Character> clist = new ArrayList<Character>();
        ArrayList<Double> dlist = new ArrayList<Double>();
    }
}
