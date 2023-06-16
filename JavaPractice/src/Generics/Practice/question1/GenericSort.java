package Generics.Practice.question1;

public class GenericSort<T extends Comparable<T>> {

    public void selectionSort(T[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            T minElement = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(minElement) < 0) {
                    minElement = arr[j];
                    minIndex = j;
                }
            }

            // Swap elements
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
