public class main {
    public static void main(String [] args){
        int lista[]= main.organizador(new int[]{9,8,7,6,5,3,2,1,4}, 0);
        for(int i = 0; i < 9; i++)
            System.out.println(lista[i]);
    }

    public static int[] organizador(int lista[], int indice){

        if(lista.length > 0){

        if (indice == lista.length -1 ){
            return lista;}

        int min = lista[indice];


        for(int i = indice; i < lista.length; i++ ){
            if(min > lista[i]){
                min = lista[i];
               int pos = i;
                lista[pos] = lista[indice];
                lista[indice] = min;
                return organizador(lista,indice+1);
            }

        }
        return organizador(lista,indice+1);
        }

        throw new UnsupportedOperationException("Vazio");
    }
}
