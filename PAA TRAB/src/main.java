import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import exercicio3.ex3;


public class
main {

    public static void main(String [] args){

        ArrayList<Integer> valor = new ArrayList<>();
        ArrayList<Integer> peso = new ArrayList<>();

        valor.add(1);
        valor.add(3);
        valor.add(4);
        valor.add(5);
        valor.add(6);
        valor.add(7);
        valor.add(8);
        valor.add(10);

        peso.add(1);
        peso.add(2);
        peso.add(3);
        peso.add(4);
        peso.add(5);
        peso.add(6);
        peso.add(7);
        peso.add(8);


        int memo[][] = ex3.criaVetorDin();
        int value[] = new int[]{10, 20, 30,40};
        int weight[] = new int[]{2, 2, 4,5};




        System.out.println(ex3.greedy(valor, peso , 190, 0));









    }

}
