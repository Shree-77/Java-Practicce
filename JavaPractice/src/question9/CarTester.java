package question9;

import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {
        Car newcar = new Car(30);
        Scanner in = new Scanner(System.in);
        System.out.println("Fuel in the Tank : " + newcar.getgasinTank());
        System.out.println("Enter the amount of petrol : ");
        int a = in.nextInt();
        System.out.println("Fuel added : " + newcar.addgas(a));
        System.out.println("Remaining fuel after drive : " + newcar.Drive(50));

        System.out.println(newcar.toString());
    }
}
