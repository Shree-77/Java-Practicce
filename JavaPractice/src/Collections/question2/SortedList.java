package Collections.question2;

import java.util.LinkedList;
import java.util.Random;

/**
 * Develop and test a program that inserts 25 random integers from 0 to 100 in
 * order into a linked-list object. For this exercise, you’ll need to modify the
 * List<T> class to maintain an ordered list. Name the new version of the class
 * SortedList.
 * Modify the SortedList class to include a merge method that can merge the
 * SortedList it receives as an argument with the SortedList that calls the
 * method. Write an application to test method merge.
 */

public class SortedList<T extends Comparable<T>> extends LinkedList<T> {

    public void insertElement(T element) {
        int index = 0;
        if (index < size() && element.compareTo(get(index)) > 0) {
            index++;
        }
        add(index, element);
    }

    public void merge(SortedList<T> otherlist) {
        for (T element : otherlist) {
            insertElement(element);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        SortedList<Integer> sortedList = new SortedList<>();
        SortedList<Integer> sortedList2 = new SortedList<>();

        for (int i = 0; i < 25; i++) {
            int num = random.nextInt(100);
            sortedList.insertElement(num);
        }
        for (int i = 0; i < 25; i++) {
            int num = random.nextInt(100);
            sortedList2.insertElement(num);
        }
        sortedList.merge(sortedList2);

        System.out.println(sortedList);

    }

}
