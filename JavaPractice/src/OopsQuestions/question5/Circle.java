package OopsQuestions.question5;

public class Circle implements Operations{
        double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3*Math.PI*(radius*radius);
    }

    @Override
    public double perimeter() {
        return Math.PI*(radius*radius);
    }
}
