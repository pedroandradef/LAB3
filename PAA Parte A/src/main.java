public class main {
    public static void main(String[] args) {

        int tamanho[] = vetores.tamanhoVetor();
        for(int x = 0; x<10; x++)
        System.out.println(tamanho[x]);
        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 10; i++) {
                System.out.println("Vetor " + i + " tamanho "+ tamanho[i] +  ": ");
                int vetor[] = vetores.criarVetor(tamanho[i]);
                int vetorClonado[] = vetores.clonaVetor(vetor);
                bubbleSort.BBSortClassico(vetor);
                insertionSort.insertionSort(vetorClonado);
                System.out.println("\n");
            }
        }
        System.out.println(tamanho[5]);
    }
}



