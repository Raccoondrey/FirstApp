package Example;

import java.util.Objects;

/**
 * Created by Kuznetsov on 14.04.2017.
 */
public class Striiing {
    public static void main(String[] args) {


        String[] myList = new String[2];

        String a = new String("Ураа");

        myList[0] = a;

        String b = new String("Лягушка");

        myList[1] = b;

        int theSize = myList.length;

        Object k = myList[0];
        System.out.println(k);
    }
}
