import java.util.Scanner;
import exercicio1.ex1;

public class main {

    public static void main(String [] args){
       //Teste EX1
        Scanner scn = new Scanner(System.in);
        int vet[] = new int[5];

        for(int i = 0; i < vet.length; i++)
            vet[i] = scn.nextInt();

        ex1.organiza(vet);

        for(int i = 0; i < vet.length; i++)
        System.out.println(vet[i]);
        //FIM Teste EX1



    }

}
