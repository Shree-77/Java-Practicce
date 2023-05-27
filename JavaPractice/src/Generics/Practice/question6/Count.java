package Generics.Practice.question6;

import java.util.Collection;

public class Count<T> {
    public int counts(Collection<T> collection, PropertyChecker<T> checker) {
        int count = 0;
        for (T element : collection) {
            if (checker.hasProperty(element))
                count++;
        }
        return count;
    }

}
