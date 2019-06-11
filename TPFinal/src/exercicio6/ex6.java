package exercicio6;

public class ex6 {

    public static int maiorSequencia(String s1, String s2){
        int vet[][] = new int[s2.length() + 1][s1.length() + 1];


        for(int l = 0; l <= s2.length(); l++){

            for(int c = 0; c <= s1.length(); c++){

                if(l == 0 || c == 0){
                    vet[l][c] = 0;
                }

                else if (s2.charAt(l - 1) == s1.charAt(c - 1))
                    vet[l][c] = vet[l-1][c-1] + 1;

                else {
                    vet[l][c] = Math.max(vet[l-1][c], vet[l][c-1]);
                }

            }
        }
        imprimeMatriz(vet);
        System.out.println("A maior subsequencia e: ");
        return vet[s2.length()][s1.length()];
    }

    public static void imprimeMatriz(int vet[][]){
        for(int l = 0; l < vet.length; l++){
            System.out.println("\n");
            for(int c = 0; c < vet.length; c++)
                System.out.print(vet[l][c] + " ");
        }

        System.out.println("\n ");

    }
}
