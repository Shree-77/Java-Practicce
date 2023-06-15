package Generics.Practice.question2;

/**
 * Develop and test a generic method printArray that takes three parameters
 * namely, a generic array
 * type and two integer arguments, lowSubscript and highSubscript. A call to
 * this method prints only the
 * designated portion of the array. Validate lowSubscript and highSubscript. If
 * either is out of range,
 * the printArray method should throw an InvalidSubscriptException; otherwise,
 * printArray should return the
 * number of elements printed. Write a main to the printArray method on arrays
 * of Integer type, Double type
 * and Character type.
 */

public class ArrayPrint<T> {

    public void printArray(T[] arr, int a, int b) {
        try {
            if (a < 0)
                throw new InvalidSubscriptException("Invalid starting index");
            if (b >= arr.length)
                throw new InvalidSubscriptException("Ending subscript must be less than the size of the array");

            for (int i = a; i <= b; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArrayPrint<Integer> intarray = new ArrayPrint<>();
        ArrayPrint<Double> doublearray = new ArrayPrint<>();
        ArrayPrint<Character> chararray = new ArrayPrint<>();

        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        Double[] arr1 = { .1, .2, .3, .4, .6, .8, .9, };
        Character[] arr2 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

        intarray.printArray(arr, 2, 6);
        System.out.println();
        doublearray.printArray(arr1, 2, 5);
        System.out.println();
        chararray.printArray(arr2, 1, 3);

    }

}