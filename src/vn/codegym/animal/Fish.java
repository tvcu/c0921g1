package vn.codegym.animal;

public abstract class Fish extends Animal implements IMarineAnimal {

    public Fish(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void swim() {
        System.out.print(name);
        System.out.println(" swimming");
    }
}
