package Collections.question3;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a static method reverseCopy that receives a List<T> as an argument and
 * returns a copy of that List<T> with its elements reversed. Test this method
 * in an application.
 */

public class reverseCopy {
    public static <T> List<T> reverse(List<T> list) {
        List<T> reversedList = new LinkedList<T>();
        for (int i = list.size() - 1; i >= 0; i--) {

            reversedList.add(list.get(i));
        }
        return reversedList;

    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(reverseCopy.reverse(list));
    }

}