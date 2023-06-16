package Generics.Practice.question4;

/**
 * Write a generic class Pair which has two type parameters—F and S— each
 * representing the type of the first
 * and second element of the pair, respectively. Add get and set methods for the
 * first and second elements of the pair.
 * [Hint: The class header should be public class Pair<F, S>.]
 */
public class Pair<F, S> {
    F first;
    S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Hello", 123);
        System.out.println(pair.getFirst()); // Output: Hello
        System.out.println(pair.getSecond()); // Output: 123

        pair.setFirst("World");
        pair.setSecond(456);
        System.out.println(pair.getFirst()); // Output: World
        System.out.println(pair.getSecond()); // Output: 456

    }

}
