package vn.codegym.animal;

public class Cat extends Animal implements ITerestrialAnimal, Speakable {

    @Override
    public void eat() {
        System.out.printf("an tap%s", name);
    }

    public Cat(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void speak() {
        System.out.print(" Meo Meo");
    }

    @Override
    public void run() {
        System.out.print(" " + name);
        System.out.println(" running");
    }

}
