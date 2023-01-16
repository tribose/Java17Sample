package DSA.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TrickyProblem {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(3, "C"); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
        linkedList.add("D");

        Iterator<String> itr = linkedList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        List<String> arrayList = new ArrayList<>(10);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(3, "C"); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
        arrayList.add("D");

        Iterator<String> itr2 = arrayList.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }
}
