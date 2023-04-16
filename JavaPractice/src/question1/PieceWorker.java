package question1;

public class PieceWorker extends Worker{
    private double wage;
    private int pieces;

    public PieceWorker(String name, String address,double wage,int pieces) {
        super(name, address);
        this.pieces=pieces;
        this.wage=wage;
    }

    double earnings(){
        return wage*pieces;
    }
}

