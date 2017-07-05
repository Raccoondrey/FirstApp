package Example;

/**
 * Created by Kuznetsov on 01.04.2017.
 */


class Lol {
    int i;

    int go(int z) {
        z = 5;
       return z;

    }
}

class Result {
    public static void main(String[] args) {

        int x = 7;

        Lol foo = new Lol();

        System.out.println(foo.go(x));
    }
}

