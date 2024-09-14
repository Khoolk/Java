//HashSet is a collection of unique items

import java.util.HashSet;

public class NiqCol {
//add() method to add item
//object added more than once appear one time because it is unique

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
//contains() method check if an object is in set
        System.out.println(numbers.contains(2));
//size
        System.out.println("size " + numbers.size());
//for-each loop
        for (int i : numbers) {
            System.out.println(i);
        }
//for loop to show what is in the set
        for (int i = 1; i <= 6; i++) {
            if (numbers.contains(i)) {
                System.out.println("got " + i);
            } else {
                System.out.println("no " + i);

            }
        }
        numbers.remove(5);
        numbers.clear();
    }
}
//other wrapper class: String, Boolean, Character, Double
