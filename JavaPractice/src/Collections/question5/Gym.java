package Collections.question5;

/**
 * Develop and test a class with LinkedList of objects of type Gym characterized
 * by the instance variables namely, its name, distance (in Km) from your place,
 * landmark and contact phone number. Populate the linked list with three such
 * objects. Show how to iterate through the elements of the linked list. Display
 * the elements of the linked list in ascending order of distance. Display name
 * of the gyms and their landmark that are within two kilometres from your
 * place.
 */

public class Gym {
    String name;
    double Distance;
    String Landmark;
    int PhoneNo;

    public Gym(String name, double distance, String landmark, int phoneNo) {
        this.name = name;
        Distance = distance;
        Landmark = landmark;
        PhoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double distance) {
        Distance = distance;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public void display() {
        System.out.println("Gym Name : " + getName() + " LandMark : " + getLandmark());

    }

}
