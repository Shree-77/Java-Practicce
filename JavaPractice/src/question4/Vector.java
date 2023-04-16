package question4;

import java.util.Arrays;

/**
 * Develop an interface with two methods namely, add and multiply for addition and multiplication of
 * mathematical objects such as vectors and matrices. Develop a class Vector that implements the
 * interface with necessary data members. Develop another class Matrix that implements the interface
 * with necessary data members. Develop a class containing the main method and show the computation
 * of the sum of two vectors and their scalar product and the sum of two matrices and the product of the
 * matrices.
 */


public class Vector implements Operations {
    private int[] vector;

    public Vector(int[] vector) {
        this.vector = vector;
    }

    public void add(Operations other) {
        Vector v = (Vector) other;
        for (int i = 0; i < vector.length; i++) {
            vector[i] += v.vector[i];
        }
    }

    public void multiply(Operations other) {
        Vector v = (Vector) other;
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= v.vector[i];
        }
    }

    public String toString() {
        return Arrays.toString(vector);
    }
}

