package trabalhoAED;

import java.util.Random;

public class MainOrdenacao {

	public static void main(String[] args) {
		int maxTam = 100000;
		int vetorA[] = new int[maxTam];
		int vetorB[] = new int[maxTam];
		int vetorRand[] = new int[maxTam];
		int vetorAux[] = new int[maxTam];

		for (int i = 0; i < vetorRand.length; i++) {
			Random rand = new Random();
			vetorRand[i] = rand.nextInt(maxTam);
			vetorAux[i] = vetorRand[i];
		}

		// VETOR A
		System.out.println("VETOR A");
		refazerVetorA(vetorA);
		BBSortClassico(vetorA);
		refazerVetorA(vetorA);
		BBSortAdap1(vetorA);
		refazerVetorA(vetorA);
		BBSortAdap2(vetorA);
		refazerVetorA(vetorA);
		Selecao(vetorA);
		refazerVetorA(vetorA);
		Insercao(vetorA);
		refazerVetorA(vetorA);
		sort(vetorA);

		// VETOR B
		System.out.println("\nVETOR B");
		refazerVetorB(vetorB);
		BBSortClassico(vetorB);
		refazerVetorB(vetorB);
		BBSortAdap1(vetorB);
		refazerVetorB(vetorB);
		BBSortAdap2(vetorB);
		refazerVetorB(vetorB);
		Selecao(vetorB);
		refazerVetorB(vetorB);
		Insercao(vetorB);
		refazerVetorA(vetorB);
		sort(vetorB);

		// VETOR C
		System.out.println("\nVETOR C");
		refazerVetorRand(vetorRand,vetorAux);
		BBSortClassico(vetorRand);
		refazerVetorRand(vetorRand,vetorAux);
		BBSortAdap1(vetorRand);
		refazerVetorRand(vetorRand,vetorAux);
		BBSortAdap2(vetorRand);
		refazerVetorRand(vetorRand,vetorAux);
		Selecao(vetorRand);
		refazerVetorRand(vetorRand,vetorAux);
		Insercao(vetorRand);
		refazerVetorRand(vetorRand,vetorAux);
		sort(vetorRand);

		// quickSort(vetorA,0,vetorA.length-1);

	}

	public static void refazerVetorA(int[] vetorA) {
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
		}
	}

	private int[] array;

	public static void refazerVetorB(int[] vetorB) {
		for (int i = vetorB.length - 1; i >= 0; i--) {
			vetorB[i] = i;
		}
	}

	public static void refazerVetorRand(int[] vetorRand, int[] vetorAux) {
		for (int i = 0; i < vetorRand.length; i++) {
			vetorRand[i] = vetorAux[i];
		}
	}

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

	public static void BBSortAdap1(int[] vetor) {
		int i, temp;
		boolean HouveTroca = true;
		long start = System.currentTimeMillis();
		while (HouveTroca) {
			HouveTroca = false;
			for (i = 0; i < vetor.length - 1; i++)
				if (vetor[i] > vetor[i + 1]) {
					temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					HouveTroca = true;
				}
		}
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("BBSortAdap1: " + elapsedTime + " milisegundo(s)");
	}

	public static void BBSortAdap2(int[] vetor) {
		int i, j, temp, cont;
		long start = System.currentTimeMillis();
		cont = vetor.length - 1;
		for (i = 0; i < vetor.length - 1; i++) {
			for (j = 0; j < cont; j++)
				if (vetor[j] > vetor[j + 1]) {
					temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			cont--;
		}
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("BBSortAdap2: " + elapsedTime + " milisegundo(s)");
	}

	public static void Selecao(int[] vetor) {
		int i, j, min, aux;
		long start = System.currentTimeMillis();
		for (i = 0; i < vetor.length - 1; i++) {
			// Procura o menor elemento a partir
			// da i-ésima posição do vetor. min = i
			// pois consideraremos no início que o
			// i-ésimo elemento é o menor do subvetor
			min = i;
			for (j = i + 1; j < vetor.length; j++)
				if (vetor[j] < vetor[min])
					min = j;
			// Troca o menor elemento de posição com
			// o elemento da posição i
			aux = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = aux;
		}
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Selecao: " + elapsedTime + " milisegundo(s)");
	}

	public static void Insercao(int[] vetor) {
		int i, j, v;
		long start = System.currentTimeMillis();
		for (i = 1; i < vetor.length; i++) {
			v = vetor[i];
			j = i;
			while ((j > 0) && (vetor[j - 1] > v)) {
				vetor[j] = vetor[j - 1];
				j--;
			}
			vetor[j] = v;
		}
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Insercao: " + elapsedTime + " milisegundo(s)");
	}

	public static void sort(int arr[]) {
		long start = System.currentTimeMillis();
		quickSortIterative(arr, 0, arr.length - 1);
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("quickSort: " + elapsedTime + " milisegundo(s)");
	}

	static void quickSortIterative(int arr[], int l, int h) {
		// Create an auxiliary stack
		int[] stack = new int[h - l + 1];

		// initialize top of stack
		int top = -1;

		// push initial values of l and h to stack
		stack[++top] = l;
		stack[++top] = h;

		// Keep popping from stack while is not empty
		while (top >= 0) {
			// Pop h and l
			h = stack[top--];
			l = stack[top--];

			// Set pivot element at its correct position
			// in sorted array
			int p = partition(arr, l, h);

			// If there are elements on left side of pivot,
			// then push left side to stack
			if (p - 1 > l) {
				stack[++top] = l;
				stack[++top] = p - 1;
			}

			// If there are elements on right side of pivot,
			// then push right side to stack
			if (p + 1 < h) {
				stack[++top] = p + 1;
				stack[++top] = h;
			}
		}
	}

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];

		// index of smaller element
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}
