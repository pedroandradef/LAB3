package exercicio7;

import java.util.ArrayList;
import java.util.HashMap;

public class ex7 {
    public static int greedyTime(ArrayList<Integer> activity, ArrayList<Integer> duration, int timeLeft, int maxAt1, int maxAt2, int result, int i, HashMap<Integer,Integer> memo){

        if(memo.get(i) != null)
            return memo.get(i);

        if(i == -1 || timeLeft == 0)
            return 0;

        if(duration.get(i) > timeLeft)
            return greedyTime(activity,duration,timeLeft,maxAt1,maxAt2,result,i-1, memo);

        else{
            maxAt1 =  activity.get(i) + greedyTime(activity,duration,timeLeft-duration.get(i), maxAt1, maxAt2, result, i,memo);
            maxAt2 = greedyTime(activity, duration, timeLeft, maxAt1, maxAt2, result, i-1, memo);
            result = Math.max(maxAt1,maxAt2);
            memo.put(i,result);
        }

        return result;
    }
}
