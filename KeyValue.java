//HashMap class store object in pairs, one object (key) used as index to another object (value)
//can store different object types: <String key & Integer value> or <String key & String value>

import java.util.HashMap;

public class KeyValue {

    public static void main(String[] args) {
        HashMap<String, Integer> item = new HashMap<String, Integer>();
//put() method add item to HashMap
        item.put("Grape", 7);
        item.put("Orange", 8);
        item.put("Kiwi", 6);
        System.out.println(item);
//get() method refer key to access value
        System.out.println(item.get("Kiwi"));
//size() method count all item
        System.out.println(item.size());
//for-each loop using keySet() method to access key only or with value
        for (String i : item.keySet()) {
            System.out.println(i + " " + item.get(i));
        }
//values() method to access value only
        for (int x : item.values()) {
            System.out.println(x);
        }
//remove() method refer key to remove item
        item.remove("Kiwi");
//clear() method remove all item
        item.clear();
    }
}
//other wrapper class: Boolean, Character, Double
