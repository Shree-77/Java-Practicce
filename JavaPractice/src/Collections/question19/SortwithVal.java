package Collections.question19;

import java.util.*;

public class SortwithVal {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(14, "Aronman");
        map.put(245, "Batman");
        map.put(111, "Shree");
        map.put(32, "Duperman");

        System.out.println("Before Sorting " + map);

        // Call the sortByValues method to sort the map by values
        HashMap<Integer, String> sortedMap = sortByValues(map);

        System.out.println("After Sorting " + sortedMap);
    }

    public static LinkedHashMap<Integer, String> sortByValues(HashMap<Integer, String> map) {
        List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());

        list.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;

        /**
         * Collections.sort(list,new Comparator<Map.Entry<Integer,String>>(){
         * public int compare(Map.Entry<Integer,String>o1,Map.Entry<Integer,String>o2){
         * return o1.getValue().compareTo(o2.getValue());
         * }
         * });
         */
    }
}
