package Example;

/**
 * Created by Kuznetsov on 01.04.2017.
 */

class One {

    private int rock;
    private String woo;

    public void setRock(int num) {
        rock = num;
    }

    public int getRock() {
        return rock;
    }


    public void setWoo(String www) {
        woo = www;
    }

    public String getWoo() {
        return woo;
    }
}

class Check {
    public static void main(String[] args) {
        One p = new One();
        p.setRock(7);
        System.out.println(p.getRock());

        p.setWoo("Super!");
        System.out.println(p.getWoo());

        Thread t = Thread.currentThread();
        System.out.println(t);

    }
}