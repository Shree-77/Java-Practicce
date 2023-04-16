package question3;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Shree21",23.00d);
        CreditCardAccount creditCardAccount = new CreditCardAccount(20000.00d,12345);

        System.out.println("Account balance after deposit "+account.depositMoney(30d));
        System.out.println("Account balance after withdraw "+account.withdrawMoney(10));
        System.out.println("Credit card balance after deposit "+creditCardAccount.depositMoney(25.0d));
        System.out.println("Credit card balance after withdraw "+creditCardAccount.withdrawMoney(20.00));

    }
}
