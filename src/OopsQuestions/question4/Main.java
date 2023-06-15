package OopsQuestions.question4;

public class Main {
    public static void main(String[] args) {
        // Vector addition and multiplication
        Vector v1 = new Vector(new int[]{1, 2, 3});
        Vector v2 = new Vector(new int[]{4, 5, 6});
        v1.add(v2);
        System.out.println("Vector addition: " + v1);
        v1.multiply(v2);
        System.out.println("Vector multiplication: " + v1);

        // Matrix addition and multiplication
        Matrix m1 = new Matrix(new int[][]{{1, 2}, {3, 4}});
        Matrix m2 = new Matrix(new int[][]{{5, 6}, {7, 8}});
        m1.add(m2);
        System.out.println("Matrix addition: " + m1);
        m1.multiply(m2);
        System.out.println("Matrix multiplication: " + m1);
    }
}
