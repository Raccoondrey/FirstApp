package Example;

/**
 * Created by Kuznetsov on 11.03.2017.
 */
class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println(" Гав! Гав!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
