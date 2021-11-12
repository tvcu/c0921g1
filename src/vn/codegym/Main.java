package vn.codegym;


import vn.codegym.animal.*;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat(1, "Miu", 3);
        Animal animal2 = new LaHan(1, "La Han", 3);
        Animal animal3 = new Frog(1, "Ech con e", 4);
        boDoi(animal1);
        boDoi(animal2);
        boDoi(animal3);
    }

    public static void boDoi(Object animal) {
        ((Animal) animal).eat();
        if (animal instanceof Speakable)
            ((Speakable) animal).speak();
        if (animal instanceof IMarineAnimal)
            ((IMarineAnimal) animal).swim();
        if (animal instanceof ITerestrialAnimal)
            ((ITerestrialAnimal) animal).run();

    }

}
