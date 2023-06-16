package Generics.LearnGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenricsExample {
    public static void main(String[] args) {
        learnGenerics<Cat> Cats = new learnGenerics<>(new Cat("Meow"));
        learnGenerics<Dog> Dogs = new learnGenerics<>(new Dog("Moffy", 12));

        Cats.Print();
        Dogs.Print();
        shout("Shree");
        shout(20);
        shout(12.321);
        MultipleGenreicMethods("Shree" , 21);
        MultipleGenreicMethods("Goku" , 45);
        Return("Hii " , "I am shree");
        Return("I am " ,21);

        //Printing Lists
        List<Integer> intlist=new ArrayList<>();
        intlist.add(23);
        printList(intlist);

        //Printing Cat Lists
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("meow"));
        printListofTypes(catList);



    }
    private static <T>void shout(T thingToShout){  //Generic Methods
        System.out.println(thingToShout+"!!!!");
    }
    private static <T,V> void MultipleGenreicMethods(T Name , V age){ //Multiple Generic methods
        System.out.println(Name+" "+age);
    }
    private  static <T , V> T Return(T returnsome , V types){
        System.out.println(returnsome+"@@");

        return returnsome;
    }

    /**
     * List of different  data types,and we're going to print
     * We use Wildcard here </?>
     */
    private static void printList(List<?> list){
        System.out.println(list);
    }
    private static void printListofTypes(List<? extends  Animals> myList){
        System.out.println(myList);

    }

}
