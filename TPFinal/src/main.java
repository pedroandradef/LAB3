import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import exercicio1.ex1;
import exercicio3.ex3;
import exercicio7.ex7;
import exercicio8.ex8;
import exercicio4.ex4;
import exercicio6.ex6;
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




//        //Teste EX3
//        int memo[][] = ex3.criaVetorDin();
//        int value[] = new int[]{10, 20, 30};
//        int weight[] = new int[]{2, 2, 4};
//
//
//        System.out.println(ex3.dinamic(2,7,memo,value,weight));

        //System.out.println(ex3.greedy(value, weight,50,0));
        //Fim Teste EX3





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

//        HashMap<Integer,Integer> memo = new HashMap<>();
//       System.out.println(ex8.fibonacci1(46, memo));

        //Fim TESTE EX7




        //TESTE EX4
//        ArrayList<Integer> apagandoGanhando = new ArrayList<>();
//        apagandoGanhando.add(1);
//        apagandoGanhando.add(2);
//        apagandoGanhando.add(3);
//        apagandoGanhando.add(1);
//        apagandoGanhando.add(2);
//        apagandoGanhando.add(3);
//        apagandoGanhando.add(9);
//
//        ex4.apagandoGanhando(apagandoGanhando,3);


//        //TESTE EX6
//        String primeira = "ABCBDAB";
//        String segunda = "BDCABA";
//
//        System.out.println(ex6.maiorSequencia(primeira,segunda));
//
//        //FIM TESTE EX6




        //TESTE EX8

        int memo[][] = ex8.criaVetorDin();
        int moedas [] = new int[] {1,2,5,10};

        System.out.println(ex8.troco(moedas, 31, memo, moedas.length-1));




    }

}
