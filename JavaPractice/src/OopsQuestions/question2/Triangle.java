package OopsQuestions.question2;
/**
 * Develop a class named Triangle that implements an interface called GeometricObject. The interface
 * GeometricObject has the abstract methods getArea() that computes and returns the area of a geometric
 * object and getPerimeter() that computes and returns the perimeter of a geometric object. The Triangle
 * class should have private double data fields named side1, side2, and side3 denoting the length of the
 * three sides of a triangle, a constructor that creates a triangle with the specified value for side1, side2
 * and side3, the getter and setter methods for all three data fields and an implementation of the getArea()
 * and getPerimeter() method. Develop a driver class to show the invocation of the getArea() and
 * getPerimeter() method on a Triangle object
 */

public class Triangle implements GeometricObject {
    double side1;
    double side2;
    double side3;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getarea() {
        double side =(side1+side2+side3)/2;
        return Math.sqrt(side*(side- side1)*(side-side2)*(side-side3));
    }

    @Override
    public double getperimeter() {
        return side1+side2+side3;
    }
}
