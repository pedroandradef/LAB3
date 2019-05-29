package exercicio1;

import java.util.ArrayList;

public class ex1 {
    public static void organiza(int vet[]){
        ArrayList<Integer> arrayNegativo = new ArrayList<Integer>();
        ArrayList<Integer> arrayZero = new ArrayList<Integer>();
        ArrayList<Integer> arrayPositivo = new ArrayList<Integer>();

        for(int i = 0; i < vet.length; i++){

            if(vet[i] < 0)
                arrayNegativo.add(vet[i]);

            if(vet[i] == 0)
                arrayZero.add(vet[i]);

            if(vet[i] > 0)
                arrayPositivo.add(vet[i]);
        }

        arrayNegativo.addAll(arrayZero);
        arrayNegativo.addAll(arrayPositivo);


        for(int i = 0; i < vet.length; i++)
            vet[i] = arrayNegativo.get(i);

    }
}
