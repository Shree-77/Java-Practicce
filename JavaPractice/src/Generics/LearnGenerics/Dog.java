package Generics.LearnGenerics;

public class Dog extends Animals{
    String preferences;

    public Dog(String name , int age){
        this.name= name;
        this.Age=age;
    }

    public Dog(String preferences) {
        this.preferences = preferences;
    }
}
