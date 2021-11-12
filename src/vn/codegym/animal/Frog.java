package vn.codegym.animal;

public class Frog extends Animal implements Speakable, IMarineAnimal, ITerestrialAnimal {
    @Override
    public void eat() {
        System.out.println(name + " An con trung");
    }

    public Frog(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void swim() {
        System.out.print(name);
        System.out.println(" swimming");
    }

    @Override
    public void run() {
        System.out.print(name);
        System.out.println(" running");
    }

    @Override
    public void speak() {
        System.out.print(name);
        System.out.println(" op pa");
    }
}
