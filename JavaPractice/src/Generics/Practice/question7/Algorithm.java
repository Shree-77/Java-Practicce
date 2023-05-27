package Generics.Practice.question7;

public final class Algorithm {

    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}

// This will not compile coz , the compare operator('>') won't
// apply for the generics type T
// Java doesn't know that the both T is the same type that
// can used for compare.
