package Generics.Practice.question6;

public class PrimeChecker implements PropertyChecker<Integer> {

    @Override
    public boolean hasProperty(Integer element) {
        if (element <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(element); i++) {
            if (element % i == 0)
                return false;
        }
        return true;
    }

}
