package vn.codegym.animal;

public class LaHan extends Fish {

    //QUAN TRONG THU XOA DE TEST
    public LaHan(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void eat() {
        System.out.println("La Han an Tap");
    }
}
