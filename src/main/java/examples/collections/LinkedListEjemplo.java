package examples.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEjemplo {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(25);
        linkedList.add(63);
        linkedList.add(53);
        linkedList.add(87);


        ListIterator<Integer> it = linkedList.listIterator();

        it.next();
        it.next();
        it.next();
        it.next();
        //it.previous();
        it.remove();

        System.out.println(linkedList);
    }
}
