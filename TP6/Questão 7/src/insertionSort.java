public class insertionSort {
    public static void insertionSort(int[] vetor) {
        int key;
        int i;
        long start = System.currentTimeMillis();

        for (int j = 1; j < vetor.length; j++)
        {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
            {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("insertionSort: " + elapsedTime + " milisegundo(s)");
    }
}
