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

    public static int dinamic(ArrayList<Integer> value, ArrayList<Integer> weight, int capacity, int i, int max1, int max2, int resultado,HashMap<Integer,Integer> memo){
        if(memo.get(capacity) != null ) //checa se existe um maior valor no HashMap com tal capacidade
            return memo.get(capacity);

        if(i == -1 || capacity == 0) //se o array acabar ou a capacidade acabar retorna 0 pois nao pode colocar mais nada na mochila
            return 0;

        if(weight.get(i) > capacity && capacity > 0) //se o peso do objeto for maior que o que cabe na mochila, chama novamente a funcao com o proximo item
            return dinamic(value, weight, capacity, i-1, max1, max2,resultado, memo);

        else {
            max1 = value.get(i) + dinamic(value,weight,capacity-weight.get(i),i,max1,max2, resultado, memo); //chama a funcao recursiva decidindo colocaro item ate nao caber mais
            max2 = dinamic(value, weight, capacity, i-1, max1, max2, resultado, memo); //chama a funcao decidindo nao colocar o item na mochila
            resultado = Math.max(max1,max2); //decide qual e mais valioso
            memo.put(capacity,value.get(i)); //adiciona no Hash o mais valioso de acordo com peso para caso precise novamente saber qual vale mais com um determinado peso
        }

        return resultado;
    }
}
