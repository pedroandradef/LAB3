package exercicio3;

import java.util.ArrayList;

public class ex3 {

    public static int greedy(ArrayList<Integer> value,ArrayList<Integer> weight, int capacity, int maxMoney){

        int maxVal = weight.size() -1;


        if(capacity > 0 && weight.size() > 0){

            while(capacity >= weight.get(maxVal)){

                maxMoney += value.get(maxVal) ;
                capacity -= weight.get(maxVal);
            }

            value.remove(maxVal);
            weight.remove(maxVal);

            return greedy(value, weight,capacity, maxMoney);
        }
        return maxMoney;


    }
}
