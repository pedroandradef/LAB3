import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoVet = 0;

        System.out.println("Tamanho do seu vetor: ");
        tamanhoVet = sc.nextInt();
        int vet[] = new int[tamanhoVet];


        System.out.println("Digite os valores: ");
        for (int i = 0; i < tamanhoVet; i++) {
            System.out.println((i+1) + " Valor: ");
            vet[i] = sc.nextInt();
        }

        somaMax(vet);
    }

    public static void somaMax(int[] vet) {
        int max = 0;
        int maxAtual = 0;


        for (int i = 0; i < vet.length; i++) {
            maxAtual = Math.max(maxAtual, 0) + vet[i];
            max = Math.max(max, maxAtual);

        }
        System.out.println("A soma maxima é: " + max);
    }
}
