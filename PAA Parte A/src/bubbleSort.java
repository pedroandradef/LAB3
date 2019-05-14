public class bubbleSort {

    public static void BBSortClassico(int[] vetor) {
        int i, j, temp;
        long start = System.currentTimeMillis();
        for (i = 0; i < vetor.length - 1; i++)
            for (j = 0; j < vetor.length - 1; j++)
                if (vetor[j] > vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("BBSortClassico: " + elapsedTime + " milisegundo(s)");
    }
}
