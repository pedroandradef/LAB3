package exercicio8;

import java.util.ArrayList;
import java.util.HashMap;

public class ex8 {
    public static int fibonacci1(int i, HashMap<Integer,Integer> memo){
        int result = 0;

        if(i <= memo.size() && memo.get(i) != null)
            return memo.get(i);

        if(i == 1 || i == 2) {
            result = 1;
            memo.put(i, result);
        }

        else {
            result = fibonacci1(i-1, memo) + fibonacci1(i-2, memo);
            memo.put(i, result);}

        return result;
    }
}
