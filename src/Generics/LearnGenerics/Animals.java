package Generics.LearnGenerics;

public class Animals {
    String name;
    int Age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public void eat(){
        System.out.println("I eat");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
