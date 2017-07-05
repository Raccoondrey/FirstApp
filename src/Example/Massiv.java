package Example;

import java.util.ArrayList;

/**
 * Created by Kuznetsov on 14.04.2017.
 */
public class Massiv {
    private int a = 55;
public int b;
}

class Egg {
    public static void main(String[] args) {

        ArrayList<Massiv> myList = new ArrayList<Massiv>();
        Massiv p = new Massiv();
        Massiv n = new Massiv();

        myList.add(p);
        myList.add(n);

        System.out.println(myList.get(0));
        System.out.println(myList.isEmpty());
    }
}
