package Example;

/**
 * Created by Kuznetsov on 23.04.2017.
 */
public class Animal {
    int hunger;


    public void roam() {
        System.out.println("Здесь что-то есть");
    }

    public void clocking() {

    }
}

class Lion extends Animal {
    public int a = 5;


    public void roam() {
        System.out.println("хмм");
    }
}

class Cat extends Animal {
    public void sleep() {
    }

    @Override
    public void roam() {
        System.out.println("meow");
    }
}

class Wolf extends Animal {
    public void eat() {

    }

    @Override
    public void roam() {
        System.out.println("Странно");
    }

    public void drink(Animal animal) {
        animal.roam();
    }
}

class Fox extends Animal {
    public void eat() {

    }
}

class Bird extends Animal {

}
class res {
    public static void main(String[] args) {
        int g =10;
        Animal[] animals = new Animal[4];
        animals[0] = new Lion();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Fox();

      /*  for (int i = 0; i < animals.length; i++) {
            animals[i].roam();
            System.out.println(g - 5);*/

      Wolf animal = new Wolf();
      animal.drink(animals[1]);
      animal.drink(animals[3]);
        }

    }

