package exercicio7;

import java.util.ArrayList;
import java.util.HashMap;

public class ex7 {
    public static int greedyTime(ArrayList<String> activity, ArrayList<Integer> duration, int timeLeft){

        int i = 0;
        int result = 0;

        while (!activity.isEmpty() || timeLeft > 0) {
            timeLeft -= duration.get(i);
            result ++;
            activity.remove(0);
            duration.remove(0);
        }
        return result;
    }
}
