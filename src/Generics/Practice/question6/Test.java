package Generics.Practice.question6;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Count<Integer> count = new Count<>();
        Count<String> count2 = new Count<>();
        Count<Integer> count3 = new Count<>();
        List<Integer> list = Arrays.asList(1, 21, 3, 42, 34, 41, 62, 71, 7);
        List<String> palindromeList = Arrays.asList("Malayalam", "Madam", "232", "Shree", "batman");
        List<Integer> primeCheckList = Arrays.asList(2, 3, 5, 7, 9, 23, 66, 77);

        int OddOccurance = count.counts(list, new OddInteger());
        System.out.println("No of odd numebers : " + OddOccurance);
        int palindromeOccurance = count2.counts(palindromeList, new palindromeChecker());
        System.out.println("Number of Palindrome in the list  : " + palindromeOccurance);
        int primeOccurance = count3.counts(primeCheckList, new PrimeChecker());
        System.out.println("No of Prime numbers in the list : " + primeOccurance);

    }

}
