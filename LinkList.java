//LinkedList class is a collection of same type object, similar to ArrayList
//has all methods (add, change, remove, clear)
//ArrayList has regular array, larger array replace the old array if not big enough to place new element
//LinkedList place new element in a container and link to other container, each container has link to next container
//ArrayList for storing & accessing data, more efficent, common to access random item in list
//LinkedList to manipulate data, has method for certain operation

import java.util.LinkedList;

public class LinkList {

    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<String>();
        llist.add("aA");
        llist.add("bB");
        llist.add("cC");
        llist.addFirst("First");
        llist.addLast("Last");
        System.out.println(llist);
        llist.removeFirst();
        llist.removeLast();
        System.out.println(llist.getFirst());
        System.out.println(llist.getLast());
    }
}
