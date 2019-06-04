import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import exercicio1.ex1;
import exercicio3.ex3;
import exercicio7.ex7;
import exercicio8.ex8;

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
       /* ArrayList<Integer> value = new ArrayList<Integer>();
        ArrayList<Integer> weight = new ArrayList<Integer>();


        value.add(10);
        value.add(20);
        value.add(30);

        weight.add(5);
        weight.add(15);
        weight.add(10);

        HashMap<Integer,Integer> memo = new HashMap<>();
        System.out.println(ex3.dinamic(value,weight,100,2,0,0,0,memo));
        //System.out.println(ex3.greedy(value, weight,50,0));
        //Fim Teste EX3*/

        //Teste EX7
       /* ArrayList<String> activity = new ArrayList<>();
        ArrayList<Integer> duration = new ArrayList<>();

        activity.add("Lavar roupa");
        activity.add("Almocar");
        activity.add("Trabalhar");

        duration.add(2);
        duration.add(5);
        duration.add(6);


        System.out.println(ex7.greedyTime(activity, duration,10);
        */

        HashMap<Integer,Integer> memo = new HashMap<>();
       System.out.println(ex8.fibonacci1(46, memo));
    }

}
