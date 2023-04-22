package OopsQuestions.question8;

/**
 * Create a class called Complex for performing arithmetic with complex numbers. Complex numbers
 *    have the form realPart + imaginaryPart * i; where i is the imaginary unit.
 *    Write a program to test your class. Use floating-point variables to represent the private data of the class.
 *    Provide a constructor that enables an object of this class to be initialized when it’s declared. Provide a
 *    no-argument constructor with default values in case no initializers are provided. Provide public methods
 *    that perform the following operations:
 *    a) Add two Complex numbers: The real parts are added together and the imaginary parts are added
 *    together.
 *    b) Subtract two Complex numbers: The real part of the right operand is subtracted from the real part of
 *    the left operand, and the imaginary part of the right operand is subtracted from the imaginary part of
 *    the left operand.
 *    c) Print Complex numbers in the form (realPart, imaginaryPart)
 */
public class Complex {
        final private double imaginary_part;
       final  private double real_part;

    public Complex(double imaginary_part, double real_part) {
        this.imaginary_part = imaginary_part;
        this.real_part = real_part;
    }

    public Complex() {
        this.imaginary_part=0;
        this.real_part=0;
    }

    public Complex add (Complex other){
        double imaginary =imaginary_part+other.imaginary_part;
        double real = real_part+ other.real_part;
            return new Complex(real,imaginary);
    }

    public  Complex sub (Complex other){
        double imaginary = imaginary_part-other.imaginary_part;
        double real = real_part- other.real_part;
        return new Complex(real,imaginary);
    }
    public  Complex Mul (Complex other){
        double imaginary = imaginary_part*other.imaginary_part;
        double real = real_part* other.real_part;
        return new Complex(real,imaginary);
    }

    @Override
    public String toString() {
        return "Complex[" +
                "imaginary_part=" + imaginary_part +
                ", real_part=" + real_part +
                ']';
    }
}
