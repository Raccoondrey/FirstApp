package Example;

/**
 * Created by Kuznetsov on 11.03.2017.
 */
 class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("проигрывание фильма");

    }
}

 public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть На Акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;

    }
}