package Generics.Practice.question6;

public class palindromeChecker implements PropertyChecker<String> {

    @Override
    public boolean hasProperty(String element) {
        String reverse = "";
        for (int i = element.length() - 1; i >= 0; i--) {
            reverse += element.charAt(i);
        }
        if (reverse.equalsIgnoreCase(element))
            return true;

        return false;
    }

}
