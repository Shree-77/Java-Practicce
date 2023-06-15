package OopsQuestions.question11;

/**
 * Write down a high-level abstraction of the following specification on the
 * answer sheet; implement and test it.
 * Consider a class Account to represent a bank account owned by a customer
 * (account holder).
 * An account is characterized by the private instance fields – an
 * account number (type String), the account balance (type double)
 * and the name of the account holder (type String). The Account
 * class should have a constructor that initializes the instance
 * fields. Provide a set and a get method for each instance field.
 * In addition, provide the deposit and withdrawal method and a
 * method named computeInterest that calculates the interest earned
 * by an account if the interest rate is 6% per annum. Test the
 * class using the main method showing the invocation of deposit,
 * withdrawal and computeInterest method.
 */

public class Account {
    private String Account_no;
    private double balance;
    private String name;

    public Account(String account_no, double balance, String name) {
        Account_no = account_no;
        this.balance = balance;
        this.name = name;
    }

    public String getAccount_no() {
        return Account_no;
    }

    public void setAccount_no(String account_no) {
        Account_no = account_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Successfully");
    }

    public void withdrawal(double amount) {
        balance -= amount;
        System.out.println("Withdraw succesfull!");
    }

    public double computeInterest(int years) {
        double interest = balance * years * 0.06;
        balance += interest;
        return interest;

    }

    public static void main(String[] args) {
        Account account = new Account("Shree123", 1234, "Batman");
        account.deposit(200);
        account.withdrawal(10);
        System.out.println(account.computeInterest(2));

    }

}