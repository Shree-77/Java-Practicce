package Collections.question4;

public class Transaction implements Comparable<Transaction> {
    String TransactionId;
    double rupees;
    String SourceAccNo;
    String DestinatonAccN0;

    public Transaction(String transactionId, double rupees, String sourceAccNo, String destinatonAccN0) {
        TransactionId = transactionId;
        this.rupees = rupees;
        SourceAccNo = sourceAccNo;
        DestinatonAccN0 = destinatonAccN0;
    }

    @Override
    public int compareTo(Transaction o) {
        if (this.rupees == o.rupees)
            return 0;
        else if (this.rupees > o.rupees)
            return 1;
        else
            return -1;
    }

    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String transactionId) {
        TransactionId = transactionId;
    }

    public double getRupees() {
        return rupees;
    }

    public void setRupees(double rupees) {
        this.rupees = rupees;
    }

    public String getSourceAccNo() {
        return SourceAccNo;
    }

    public void setSourceAccNo(String sourceAccNo) {
        SourceAccNo = sourceAccNo;
    }

    public String getDestinatonAccN0() {
        return DestinatonAccN0;
    }

    public void setDestinatonAccN0(String destinatonAccN0) {
        DestinatonAccN0 = destinatonAccN0;
    }

    public void display() {
        System.out.println("Transaction id : " + getTransactionId() + " Rupees : " + getRupees() + " Source Account : "
                + getSourceAccNo() + " Destination Account : " + getDestinatonAccN0());
    }

}
