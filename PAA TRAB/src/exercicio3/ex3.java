package exercicio3;

import java.util.ArrayList;
import java.util.HashMap;

public class ex3 {

    public static int greedy(ArrayList<Integer> value,ArrayList<Integer> weight, int capacity, int maxMoney){
        Runtime rt = Runtime.getRuntime();
        long totalM = 0;

        totalM = rt.totalMemory();

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

        System.out.println((rt.totalMemory()));
        return maxMoney;


    }

    public static int [][] criaVetorDin(){
        int memo[][] = new int[50][50];
        for(int i = 0; i < 50; i++){
            for(int j = 0; j < 50; j++)
                memo[i][j] = -1;
        }
        return memo;
    }


   public static int dinamic(int i, int cap, int memo[][], int value[], int weight[]){


        if(i == 0 || cap == 0)
            return 0;

        if(cap < weight[i])
            dinamic(i-1,cap,memo,value,weight);

        if(memo[i][cap] > -1)
            return memo[i][cap];


        int max1 =  value[i] + dinamic(i-1, cap - weight[i], memo, value, weight ) ;
        int max2 = dinamic(i-1, cap, memo, value, weight);
        memo[i][cap] = Math.max(max1, max2);

        return memo[i][cap];

   }
}
