package Example;

import java.util.logging.Logger;

/**
 * Created by Kuznetsov on 20.03.2017.
 */
public class TestArray {

    public static void main(String[] args) {
        int ref;

        int y = 0;
        while (y < 4) { Logger log = Logger.getLogger(TestArray.class.getName());
            int[] index = new int[4];
            String[] islands = new String[4];
            index[0] = 1;
            index[1] = 3;
            index[2] = 0;
            index[3] = 2;

            ref = index[y];

            islands[0] = "Бермуды";
            islands[1] = "Фиджи";
            islands[2] = "Азовские острова";
            islands[3] = "Косумель";

            log.info("острова = " + islands[ref]);
            y = y + 1;


        }
    }
}

