package Generics.Practice.question6;

public class OddInteger implements PropertyChecker<Integer> {

    @Override
    public boolean hasProperty(Integer element) {
        return element % 2 != 0;
    }

}
