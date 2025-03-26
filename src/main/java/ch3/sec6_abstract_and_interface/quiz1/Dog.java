package ch3.sec6_abstract_and_interface.quiz1;

public class Dog extends Animal implements Printable {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
    }

    @Override
    public void makeSound() {

    }

    public void fetch() {}

    @Override
    public void print() {}
}
