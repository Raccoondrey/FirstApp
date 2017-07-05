package Example;

/**
 * Created by Kuznetsov on 05.03.2017.
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"умный", "классынй", "взаимный", "метод критического пути", "на основе веб-технологий", "круглосуточный", "динамичный"};
        String[] wordListTwo = {"трудный", "ориентированный", "центральный", "фирменный", "позиционированный", "сетевой", "общий"};
        String[] wordListThree = {"процесс", "талант", "подход", "портал", "обзор", "образец", "период времени"};

        int oneLengt = wordListOne.length;
        int twoLengt = wordListTwo.length;
        int threeLengt = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLengt);
        int rand2 = (int) (Math.random() * twoLengt);
        int rand3 = (int) (Math.random() * threeLengt);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Все, что нам нужно – это " + phrase);


    }

}
