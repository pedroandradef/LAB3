import java.util.Random;

public class vetores {

    public static int[] criarVetor(int tamanhoVetor) {
        Random rdm = new Random();
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = rdm.nextInt();
        }

        return vetor;
    }


    public static void lerVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static int[] tamanhoVetor() {
        int x = 0;
        Random rdm = new Random();
        int tamanho[] = new int[10];
        for (int i = 0; i < 10; i++) {
            x += 10000;
            tamanho[i] = x;
        }
        return tamanho;
    }
}
