package Generics.Practice.question3;

/**
 * Write a simple generic version of method isEqualTo that compares its two
 * arguments with the equals
 * method and returns true if they’re equal and false otherwise. Use this
 * generic method in a program that calls
 * isEqualTo with a variety of built-in types, such as Object or Integer.
 * 
 */
public class Compares {
    public static <T> boolean isEqualTo(T a, T b) {
        if (a == null && b == null)
            return true;
        if (a.equals(b))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(isEqualTo(obj1, obj2));

        Integer a = 10;
        Integer b = 10;
        System.out.println(isEqualTo(a, b));

        String me = "Shree";
        String anotherme = "Batman";
        System.out.println(isEqualTo(me, anotherme));
    }
}
