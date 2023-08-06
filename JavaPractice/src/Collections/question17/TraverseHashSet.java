package Collections.question17;

import java.util.HashSet;
import java.util.Iterator;


public class TraverseHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(78);

        set.add(72);


        for(int i:set){
            System.out.println(i);
        }
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
