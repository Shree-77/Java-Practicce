package Collections.question13;

import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        Map<Integer,String> mymap = new HashMap<>();
        mymap.put(12,"Shree");
        mymap.put(23,"Me");
        System.out.println("First Map " +mymap);
        Map<Integer,String>secondMap = new HashMap<>();
        secondMap.put(1,"Shree V");
        secondMap.putAll(mymap);
        System.out.println("SecondMap "+secondMap);

        //Sort the Map using TreeMap

        Map<Integer,String>tree = new TreeMap<>(secondMap);
        System.out.println(tree);

        //SortMap using LinkedHashMap and ArrayList

        List<Map.Entry<Integer,String >>list = new ArrayList<>(secondMap.entrySet());
        list.sort(Map.Entry.comparingByKey());

        Map<Integer , String >sortedMap = new LinkedHashMap<>();

        for(Map.Entry<Integer,String>map : list){
            sortedMap.put(map.getKey() , map.getValue());
        }

        System.out.println(sortedMap);

    }
}
