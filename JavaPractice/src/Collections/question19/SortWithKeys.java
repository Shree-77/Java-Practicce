package Collections.question19;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortWithKeys {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(14,"ironman");
        map.put(245,"Batman");
        map.put(111,"Shree");
        map.put(32,"Superman");

        System.out.println("Before Sorting " +map);

        TreeMap<Integer,String> sortedmap = new TreeMap<>(map);
        System.out.println(sortedmap);

for (Map.Entry<Integer,String> entry :map.entrySet()){
    int key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key + ":" + value);
}
    }
}
