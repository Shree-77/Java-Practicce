package Collections.question4;

import java.util.Set;
import java.util.TreeSet;

/**
 * Develop and test a class with TreeSet of objects of type Transaction for
 * modeling a transaction involving transfer of money from one account number to
 * another. A Transaction object is characterized by its transaction id, amount
 * in rupees, source account number and destination account number. Populate the
 * tree set with three such objects. Show how to iterate through the elements of
 * the tree set. Display the transaction id with the maximum transaction amount
 * and display transaction ids with amount less than five thousand rupees.
 */

public class Account {
    public static void main(String[] args) {

        Set<Transaction> transaction = new TreeSet<Transaction>().descendingSet();
        Transaction transaction1 = new Transaction("12s3df", 10000, "Shree`123", "Batman456");
        Transaction transaction2 = new Transaction("12f3dy", 3000, "Shree`123", "Robin456");
        Transaction transaction3 = new Transaction("12j3ds", 400000, "Shree`123", "Dick567");
        Transaction transaction4 = new Transaction("12l3a", 500000, "Shree`123", "Alfred456");

        transaction.add(transaction1);
        transaction.add(transaction2);
        transaction.add(transaction3);
        transaction.add(transaction4);

        for (Transaction transactions : transaction) {
            transactions.display();
        }

    }
}
