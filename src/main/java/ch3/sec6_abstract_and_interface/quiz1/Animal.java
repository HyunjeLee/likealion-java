package ch3.sec6_abstract_and_interface.quiz1;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
}
