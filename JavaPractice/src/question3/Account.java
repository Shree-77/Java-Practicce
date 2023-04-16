package question3;

/**
 * Develop an interface with two methods namely, withdraw money and deposit money. Develop a class
 * Account that implements the interface with necessary private data members such as current account
 * balance and account number. Develop another class CreditCardAccount that implements the interface
 * with necessary data members such as current credit limit and the credit card number. When money is
 * withdrawn from a credit card account; the credit limit is diminished by the amount of money withdrawn
 * and by an additional 0.5% of the amount of money withdrawn and when the money is deposited; the
 * credit limit is increased by the amount of money deposited. Develop a class containing the main method
 * and create an account object and a credit card account object and demonstrate the withdrawal and
 * deposit method on the objects.
 */
public class Account implements money{

    private String acc_no;
    private double acc_balance;

    public Account(String acc_no, double acc_balance) {
        this.acc_no = acc_no;
        this.acc_balance = acc_balance;
    }

    @Override
    public double withdrawMoney(double money) {
        return acc_balance-money;
    }

    @Override
    public double depositMoney(double money) {
        return acc_balance+money;
    }
}
