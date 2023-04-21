package question8;

public class Main {
    public static void main(String[] args) {
        Complex complex = new Complex(12,2);
        Complex complex1 = new Complex(22,12);

        System.out.println("Sum : "+complex1.add(complex));
        System.out.println("Sub : "+complex1.sub(complex));
        System.out.println("Mul : "+complex1.Mul(complex));

        System.out.println( complex1.toString());;
    }
}
