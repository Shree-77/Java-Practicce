package question6;

import java.util.Arrays;
import java.util.Random;

/**
 * Develop and test an object-oriented application to simulate the rolling of two dice. The application
 * should use an object of Random class once to roll the first die and again to roll the second die. The sum
 * of the two values should then be calculated. Each die can show an integer value from 1 to 6, so the sum
 * of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least frequent
 * (verify using code). Your application should roll the dice 1296 times. Use a one-dimensional array to tally
 * the number of times each possible sum appears. Display the results in a tabular format showing the sum
 * in one column and the number of times each possible sum occurs in a trial of 1296 times in another
 * column and compute the Chi-square value defined by ∑ ((O-E)^2)/E, where O and E are respectively observed
 * and expected number of occurrences of the events (2 to 12) and conclude whether the dice are
 * unbiased. (Chi-square value at 5% level of significance for ten degrees of freedom is 18.307)
 */
public class Dices {

    public static void main(String[] args) {
        Random random = new Random();
        int dice1 ,dice2;
        int[]count=new int[11];

        for(int i=0;i<=1296;i++){
            dice1=random.nextInt(6)+1;
            dice2=random.nextInt(6)+1;
            int sum = dice1+dice2;
            count[sum-2]++;
        }
        int maximum =0;int sum=0;int minimum=0;

        for(int i=0;i< count.length;i++){
            if(count[i]>sum){
                sum=count[i];
                maximum=i+2;
            }
            if(count[i]<sum){
                sum=count[i];
                minimum=i+2;
            }

        }
        System.out.println( Arrays.toString(count));

        System.out.println("Most frequented number is : "+maximum);
        System.out.println("Less Frequented number is : "+minimum);

        double[]expected ={1,2,3,4,5,6,5,4,3,2,1};
        double chisquare=0;

        for(int i=0;i<11;i++){
            double observed=count[i];
            double difference = observed-expected[i];
            chisquare+=difference*difference/expected[i];
        }
        System.out.printf("Chi-square value: %.3f\n", chisquare);


        if (chisquare > 18.307) {
            System.out.println("The dice are biased.");
        } else {
            System.out.println("The dice are unbiased.");
        }


    }
}
