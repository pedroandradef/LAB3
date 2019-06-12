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
        Scanner scn = new Scanner(System.in);
       //Teste EX1
        System.out.println("Exercicio 1");
        System.out.println("tamanho do vetor a ser organizado: ");
        int tamanho = scn.nextInt();

        int vet[] = new int[tamanho];

        for(int i = 0; i < vet.length; i++){
            System.out.println("Numero: ");
            vet[i] = scn.nextInt();}

        ex1.organiza(vet);
        System.out.println("");
        for(int i = 0; i < vet.length; i++)
        System.out.println(vet[i]);





        //Teste EX3
        System.out.println("\nExercicio 3 Algoritmo Guloso / Programacao dinamica");
        System.out.println("Capacidade da mochila: ");
        int capacidade = scn.nextInt();

        System.out.println("Numero de itens: ");
        int numItens = scn.nextInt();

        ArrayList<Integer> value1 = new ArrayList<>();
        ArrayList<Integer> weight1 = new ArrayList<>();


        int value[] = new int[numItens];
        int weight[] = new int[numItens];
        System.out.println("Digite os valores e peso: ");
        for(int i = 0; i < value.length; i++){
            System.out.println("Valor:  ");
            value[i] = scn.nextInt();
            value1.add(value[i]);
            System.out.println("Peso: ");
            weight[i] = scn.nextInt();
            weight1.add(weight[i]);
        }

        System.out.println("Maior valor para a programacao dinamica: " + ex3.dinamic(numItens,capacidade,value,weight));
        System.out.println("Maior valor para o algoritmo guloso: " + ex3.greedy(value1, weight1,capacidade,0));
//


        //TESTE EX4
        System.out.println("\nExercicio 4");
        System.out.println("Quantos numeros serao removidos: ");
        int remove = scn.nextInt();
        System.out.println("Quantos numeros serao adicionados na lousa: ");
        int quant = scn.nextInt();


        ArrayList<Integer> apagandoGanhando = new ArrayList<>();

        for(int i = 1; i < quant+1; i++){
            System.out.println("Digito " + i + " : ");
            int num = scn.nextInt();
            apagandoGanhando.add(num);
        }


        ex4.apagandoGanhando(apagandoGanhando,remove);


//        //TESTE EX6

        System.out.println("\nExercicio 6");
        System.out.println("Digite o primeiro conjunto por exemplo(ABCBDAB): ");
        String primeira = scn.next();
        System.out.println("Digite o segundo conjunto: ");
        String segunda = scn.next();

       System.out.println(ex6.maiorSequencia(primeira,segunda));





        //Teste EX7

        System.out.println("\nExercicio 7");
        ArrayList<String> activity = new ArrayList<>();
        ArrayList<Integer> duration = new ArrayList<>();

        System.out.println("Numero de atividades: ");
        int atvd = scn.nextInt();

        System.out.println("Digite quanto tempo voce tem para fazer essas atividades: ");
        int tempo = scn.nextInt();

        for(int i = 0; i < atvd; i++){
            System.out.println("Digite o nome da atividade: ");
            String nome = scn.next();
            activity.add(nome);
            System.out.println("Tempo de duracao: ");
            int duracao = scn.nextInt();
            duration.add(duracao);
        }


        System.out.println("Numero maximo de atividades feitas:  " + ex7.greedyTime(activity, duration,tempo));


        //TESTE EX8
        System.out.println("\n Exercicio 8");
        System.out.println("Valor desejado: ");
        int num = scn.nextInt();
        HashMap<Integer,Integer> memo = new HashMap<>();
        System.out.println(ex8.fibonacci1(num, memo));
//        int memo[][] = ex8.criaVetorDin();
//        int moedas [] = new int[] {1,2,5,10};
//
//        System.out.println(ex8.troco(moedas, 31, memo, moedas.length-1));




    }

}
