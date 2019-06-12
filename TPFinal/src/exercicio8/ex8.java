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

    public static int troco(int moedas[], int troco, int memo[][], int i){
        if(i == -1 || troco == 0)
            return 0;

        if(troco < moedas[i])
            return troco(moedas,troco, memo, i-1);

        if( memo[i][troco] < 999)
            return memo[i][troco];

        int min1 = troco(moedas, troco - moedas[i], memo, i) + 1 ;
        int min2 = troco(moedas, troco, memo, i-1);
        memo[i][troco] = Math.min(min1, min2);

        return memo[i][troco];

    }

    public static int [][] criaVetorDin(){
        int memo[][] = new int[50][50];
        for(int i = 0; i < 50; i++){
            for(int j = 0; j < 50; j++)
                memo[i][j] = 999;
        }
        return memo;
    }
}
