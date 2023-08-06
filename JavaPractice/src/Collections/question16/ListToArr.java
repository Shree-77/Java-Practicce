package Collections.question16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArr {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(34);
        list.add(11);
        int[] arr = new int[list.size()];
        int count=0;
       for(int i:list){
           arr[count]=i;
           count++;
       }
        System.out.println(Arrays.toString(arr));
    }
}
