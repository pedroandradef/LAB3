package exercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ex7 {
    public static int greedyTime(ArrayList<String> activity, ArrayList<Integer> duration, int timeLeft){

        int result = 0;
        Collections.sort(duration);



        while (!duration.isEmpty() && timeLeft > duration.get(0)) {
            timeLeft -= duration.get(0);
            result ++;
            activity.remove(0);
            duration.remove(0);
        }
        return result;
    }
}
