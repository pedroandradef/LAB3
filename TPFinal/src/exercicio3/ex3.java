package exercicio3;

import java.util.ArrayList;
import java.util.HashMap;

public class ex3 {

    public static int greedy(ArrayList<Integer> value,ArrayList<Integer> weight, int capacity, int maxMoney){

        int maxVal = value.size() -1; //busca o item de maior valor ja que e proporcional ao tamanho do array


        if(capacity > 0 && weight.size() > 0){ //checa se a capacidade da mochila e maior que 0 e ainda existe um item no array

            while(capacity >= weight.get(maxVal)){

                maxMoney += value.get(maxVal) ;
                capacity -= weight.get(maxVal);
            }

            value.remove(maxVal); //Remove o item do array de maior valor pois nao cabe mais dele na mochila
            weight.remove(maxVal); // ||

            return greedy(value, weight,capacity, maxMoney); //recursiva o metodo chamando com o novo maior valor.
        }
        return maxMoney;


    }

    public static int [][] criaVetorDin(){
        int memo[][] = new int[100][100];
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++)
                memo[i][j] = -1;
        }
        return memo;
    }


   public static int dinamic(int i, int cap, int value[], int weight[]){


       int memo[][] = new int[i+1][cap+1];

       for (int j = 0; j <= i; j++)
       {
           for (int k = 0; k <= cap; k++)
           {
               if (j == 0 || k == 0)
                   memo[j][k] = 0;

               else if (weight[i-1] <= k)
                   memo[j][k] = Math.max(value[i-1] + memo[i-1][k-weight[i-1]],  memo[i-1][k]);

               else
                   memo[j][k] = memo[j-1][k];
           }
       }

       return memo[i][cap];
   }
}
