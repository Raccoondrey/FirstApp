package Example;

/**
 * Created by Kuznetsov on 22.04.2017.
 */
public abstract class SuperHeroes {
    String suit;
    String specialPower;

    abstract void useSpecialPower ();
    void putOnSuit (String o) {
        suit = o;

    }

    String something () {
        return suit;
    }
}
