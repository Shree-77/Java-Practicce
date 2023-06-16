package Collections.question1;

import java.util.LinkedList;
import java.util.List;

/**
 * Develop and test a program that concatenates two linked list objects of
 * characters. The class ListConcatenate should include a static method
 * concatenate that takes references to both list objects as arguments and
 * concatenates the second list to the first list.
 */

public class ListConcatenate {

    public static <T> void concatenate(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);

        concatenate(list1, list2);

        for (int element : list1) {
            System.out.print(element + " ");
        }
    }
}