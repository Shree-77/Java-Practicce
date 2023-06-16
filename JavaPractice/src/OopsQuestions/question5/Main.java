package OopsQuestions.question5;
/**
 * Develop an interface with two methods for computing area and perimeter of a 2D shape. Develop a
 * class Circle that implements this interface with necessary data members. Develop another class
 * Rectangle that implements the interface with necessary data members. Develop a class containing the
 * main method and show the area and perimeter of a circle object with specified radius and center and
 * the area and perimeter of a rectangle object with specified dimensions.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(20.00,10.00);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
