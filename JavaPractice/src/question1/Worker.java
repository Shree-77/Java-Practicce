package question1;

/**
 * Develop an abstract class named Worker with private data members name and address along with
 * the getter and setter methods for the fields, a two-argument constructor and an abstract method called
 * earnings() to compute the income of a worker. Design another class named PieceWorker that should
 * contain private instance variables wage (to store the worker’s wage per piece) and pieces (to store the
 * number of pieces produced). Provide a concrete implementation of the method earnings in the class
 * PieceWorker that calculates the worker’s earnings by multiplying the number of pieces produced by the
 * wage per piece. Develop a class containing the main method to show the invocation of the earnings( )
 * method on a PieceWorker object.
 */

public abstract class Worker {
    private String name;
    private String address;

    public Worker(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
