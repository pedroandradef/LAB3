import java.util.Random;
public class main {
    public static void main(String[] args) {
        Random rdm = new Random();
        int vetor[] = new int [1000];
        for (int i = 0; i< 1000; i++)
            vetor[i] = rdm.nextInt();
        long inicio = System.currentTimeMillis();
        main.organizador(vetor,0);
        System.out.println(System.currentTimeMillis() - inicio);
        inicio = System.currentTimeMillis();
        quickSort(vetor, 0, vetor.length - 1);
        System.out.println(System.currentTimeMillis() - inicio);
    }

    public static int[] organizador(int lista[], int indice) {

        if (lista.length > 0) {

            if (indice == lista.length - 1) {
                return lista;
            }

            int min = lista[indice];


            for (int i = indice; i < lista.length; i++) {
                if (min > lista[i]) {
                    min = lista[i];
                    int pos = i;
                    lista[pos] = lista[indice];
                    lista[indice] = min;
                }
            }
            return organizador(lista, indice + 1);
        }
        throw new UnsupportedOperationException("Vazio");

    }


    public static void quickSort(int v[], int esquerda, int direita) {

        int esq = esquerda;
        int dir = direita;
        int pivo = v[(esq + dir) / 2];
        int troca;
        while (esq <= dir) {
            while (v[esq] < pivo) {
                esq = esq + 1;
            }
            while (v[dir] > pivo) {
                dir = dir - 1;
            }
            if (esq <= dir) {
                troca = v[esq];
                v[esq] = v[dir];
                v[dir] = troca;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda)
            quickSort(v, esquerda, dir);
        if (esq < direita)
            quickSort(v, esq, direita);

    }
}


