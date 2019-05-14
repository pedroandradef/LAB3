package trabalhoAED;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class Main {
	static int tamanhoVetor = 25000;
	static int vetorA[] = new int[tamanhoVetor];
	static int vetorB[] = new int[tamanhoVetor];
	static int vetorRand[] = new int[tamanhoVetor];

	

	public static void main(String[] args) {
		for(int i=0;i<vetorRand.length;i++) {
			Random rand = new Random();
			vetorRand[i] = rand.nextInt(tamanhoVetor);
		}
		
		for(int i=0;i<vetorA.length;i++) {
			vetorA[i] = i+1;
		}
		
		for(int i=vetorB.length-1;i>=0;i--) {
			vetorB[i] = i;
		}
		
		Random rand = new Random();
		int num = rand.nextInt(tamanhoVetor-1)+1;
		num = 24999;
		
		CArvBin arvBinA = new CArvBin();	
		ArvoreAvl avlA = new ArvoreAvl();
		
		CArvBin arvBinB = new CArvBin();	
		ArvoreAvl avlB = new ArvoreAvl();
		
		CArvBin arvBinC = new CArvBin();	
		ArvoreAvl avlC = new ArvoreAvl();
		
		inserirVetorAABP(arvBinA);
		inserirVetorAAVL(avlA);
		inserirVetorBABP(arvBinB);
		inserirVetorBAVL(avlB);
		inserirVetorCABP(arvBinC);
		inserirVetorCAVL(avlC);
		consultaAABP(arvBinA,num);
		consultaAAVL(avlA,num);
		consultaBABP(arvBinA,num);
		consultaBAVL(avlA,num);
		consultaCABP(arvBinA,num);
		consultaCAVL(avlA,num);
		
	}

	static void inserirVetorAABP(CArvBin arvBin){
		long start = System.currentTimeMillis(); 
		for(int i=0;i<vetorA.length;i++) {
			arvBin.adicionar(vetorA[i]);
		}
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("Inserindo o vetor A na ABP é: "+elapsedTime+" milisegundo(s)");
	}

	static void inserirVetorAAVL(ArvoreAvl avl ) {
		long start = System.currentTimeMillis(); 
		for(int i=0;i<vetorA.length;i++) 
			avl.inserir(vetorA[i]);
		
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("Inserindo o vetor A na AVL é: "+elapsedTime+" milisegundo(s)");
	}
	
	static void inserirVetorBABP(CArvBin arvBin){
		long start = System.currentTimeMillis(); 
		for(int i=vetorB.length-1;i>=0;i--) 
			arvBin.adicionar(vetorB[i]);
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("Inserindo o vetor B na ABP é: "+elapsedTime+" milisegundo(s)");
	}

	static void inserirVetorBAVL(ArvoreAvl avl ) {
		long start = System.currentTimeMillis(); 
		for(int i=vetorB.length-1;i>=0;i--) 
			avl.inserir(vetorB[i]);
		
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("Inserindo o vetor B na AVL é: "+elapsedTime+" milisegundo(s)");
	}
	
	static void inserirVetorCABP(CArvBin arvBin){
		long start = System.currentTimeMillis(); 	
		for(int i=0;i<vetorRand.length;i++) {
			arvBin.adicionar(vetorRand[i]);
		}
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("Inserindo o vetor C na ABP é: "+elapsedTime+" milisegundo(s)");
	}

	static void inserirVetorCAVL(ArvoreAvl avl ) {
		long start = System.currentTimeMillis(); 
		for(int i=0;i<vetorRand.length;i++) 
			avl.inserir(vetorRand[i]);
		
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("Inserindo o vetor C na AVL é: "+elapsedTime+" milisegundo(s)");
	}

	static void consultaAABP(CArvBin arvBin,int num) {
		long start = System.currentTimeMillis(); 
			arvBin.achar(num);
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("ABP | Vetor A | Consultando o valor "+num+" demorou: "+elapsedTime+" milisegundo(s)");
	}
	
	static void consultaAAVL(ArvoreAvl avl,int num) {
		long start = System.currentTimeMillis(); 
			avl.achar(num);
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("AVL | Vetor A | Consultando o valor "+num+" demorou: "+elapsedTime+" milisegundo(s)");
	}
	
	static void consultaBABP(CArvBin arvBin,int num) {
		long start = System.currentTimeMillis(); 
			arvBin.achar(num);
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("ABP | Vetor B | Consultando o valor "+num+" demorou: "+elapsedTime+" milisegundo(s)");
	}
	
	static void consultaBAVL(ArvoreAvl avl,int num) {
		long start = System.currentTimeMillis(); 
			avl.achar(num);
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("AVL | Vetor B | Consultando o valor "+num+" demorou: "+elapsedTime+" milisegundo(s)");
	}
	
	static void consultaCABP(CArvBin arvBin,int num) {
		long start = System.currentTimeMillis(); 
			arvBin.achar(num);
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("ABP | Vetor C | Consultando o valor "+num+" demorou: "+elapsedTime+" milisegundo(s)");
	}
	
	static void consultaCAVL(ArvoreAvl avl,int num) {
		long start = System.currentTimeMillis(); 
			avl.achar(num);
		long elapsedTime =System.currentTimeMillis()-start;
		System.out.println("AVL | Vetor C | Consultando o valor "+num+" demorou: "+elapsedTime+" milisegundo(s)");
	}
	
}
