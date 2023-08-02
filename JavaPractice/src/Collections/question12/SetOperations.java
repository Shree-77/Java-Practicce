package Collections.question12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> integerSet= new HashSet<>();
        integerSet.add(3);
        System.out.println(integerSet);
        for (int i=0;i<5;i++){
            integerSet.add(i);
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(integerSet.contains(3));
        integerSet.remove(3);
        System.out.println(integerSet.contains(3));
        System.out.println(integerSet);
    }
}
