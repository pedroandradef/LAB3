public class main {
    public static void main(String[] args) {

        int tamanho[] = vetores.tamanhoVetor();
        for(int x = 0; x<10; x++)
        System.out.println(tamanho[x]);
        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 10; i++) {
                System.out.println("Vetor " + i + " tamanho "+ tamanho[i] +  ": ");
                bubbleSort.BBSortClassico(vetores.criarVetor(tamanho[i]));
                insertionSort.insertionSort(vetores.criarVetor(tamanho[i]));
                System.out.println("\n");
            }
        }
        System.out.println(tamanho[1]);
    }
}



