package ch3.sec6_abstract_and_interface.quiz1;

public class Cat extends Animal implements Printable {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
    }

    @Override
    public void makeSound() {

    }

    public void climb() {}

    @Override
    public void print() {}
}
