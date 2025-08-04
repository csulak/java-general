package examples.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEjemplo {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(25);
        linkedList.add(63);
        linkedList.add(53);
        linkedList.add(87);

        System.out.println(linkedList.get(1));
    }
}
