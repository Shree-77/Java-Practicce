package Collections.question11;

import java.util.LinkedList;
import java.util.List;

/*
Problem 1: List Operations
Write a Java program to perform the following operations on a List:

a) Add elements to the List.
b) Remove an element from the List.
c) Check if a specific element exists in the List.
d) Find the size of the List.
 */
public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for(int i=0;i<10;i++){
            list.add(i);
        }

        for (int i:list){
            System.out.print(i + "->");
        }
        System.out.println();
        System.out.println(list.get(6));

        for (int i=0;i<5;i++){
            list.remove(i);
        }


        for (int i:list){
            System.out.print(i + "->");
        }

    }
}
