package Collections.question18;

import java.util.*;

public class IterateMap {
    public static void main(String[] args) {
        Map<Integer,String>student = new HashMap<>();
        student.put(1,"Shree");
        student.put(2,"basheer");
        student.put(17,"Ananthan");
        student.put(21,"Dinesh");

     for(int i:student.keySet()){
         System.out.print(i + " " + student.get(i) + " ");
     }

        System.out.println();
     Set<Integer> set = student.keySet();
     Iterator<Integer> iterator = set.iterator();

     while (iterator.hasNext()){
         int key = iterator.next();
         System.out.println(key + " " + student.get(key));
     }




    }
}
