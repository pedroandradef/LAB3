import java.util.ArrayList;
import java.util.Scanner;
import exercicio1.ex1;
import exercicio3.ex3;

public class main {

    public static void main(String [] args){
       //Teste EX1
   /*     Scanner scn = new Scanner(System.in);
        int vet[] = new int[5];

        for(int i = 0; i < vet.length; i++)
            vet[i] = scn.nextInt();

        ex1.organiza(vet);

        for(int i = 0; i < vet.length; i++)
        System.out.println(vet[i]);*/
        //FIM Teste EX1

        //Teste EX3
        ArrayList<Integer> value = new ArrayList<Integer>();
        ArrayList<Integer> weight = new ArrayList<Integer>();


        value.add(60);
        value.add(100);
        value.add(120);

        weight.add(10);
        weight.add(20);
        weight.add(30);


        System.out.println(ex3.greedy(value, weight,50,0));
        //Fim Teste EX3


    }

}
