package Generics.Practice.question1;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        Integer[] intArray = { 5, 3, 8, 2, 1 };
        Float[] floatArray = { 3.14f, 1.618f, 2.718f, 0.577f };

        GenericSort<Integer> intSorter = new GenericSort<>();
        intSorter.selectionSort(intArray);

        GenericSort<Float> floatSorter = new GenericSort<>();
        floatSorter.selectionSort(floatArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(floatArray));
    }
}
