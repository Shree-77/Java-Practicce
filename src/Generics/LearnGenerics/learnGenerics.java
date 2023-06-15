package Generics.LearnGenerics;
//Learning What is generics before solving the problems

public class learnGenerics <T extends Animals>{             //Use "<>" for defining type paramter (T- type)
    T thingtoPrint;

    public learnGenerics(T thingtoPrint) {
        this.thingtoPrint = thingtoPrint;
    }
    public void Print(){
        thingtoPrint.eat();

    }
}
